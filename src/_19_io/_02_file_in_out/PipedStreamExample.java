package _19_io._02_file_in_out;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

    private InputStream pipedInputStream;

    public static void main(String[] args) throws IOException, InterruptedException {
        new PipedStreamExample().test();
    }

    private void test() throws IOException, InterruptedException {
        // Create a 'pipedOutputStream',
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        // Data writing to 'pipedOutputStream'
        // will automatically appear in 'pipedInputStream'.
        pipedInputStream = new PipedInputStream(pipedOutputStream);

        new ThreadRead().start();

        char[] chs = new char[]{'a', 'b', 'c', 'd', 'e'};

        // Write data to 'pipedOutputStream'.
        for (char ch : chs) {
            pipedOutputStream.write(ch);
            Thread.sleep(1000);
        }
        pipedOutputStream.close();
    }

    private void closeQuietly(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }

    // A Thread to read the data that appears on 'pipedInputStream'.
    class ThreadRead extends Thread {

        @Override
        public void run() {
            try {
                int data = 0;
                while ((data = pipedInputStream.read()) != -1) {
                    System.out.println((char) data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                closeQuietly(pipedInputStream);
            }
        }
    }

}