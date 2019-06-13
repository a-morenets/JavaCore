package _20_multithreading._11_interrupt;

public class CatLife {

    public static void main(String[] args) throws InterruptedException {
        Thread cat = new Thread(new Cat());
        cat.start();
        Thread.sleep(5000);
        cat.interrupt();
        cat.join();
    }

    static class Cat implements Runnable {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Сон начинается");
                sleep2sec();
                System.out.println("Сон закончился\n");
            }
            System.out.println("Завершение работы потока");
        }

        private void sleep2sec() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Сон прерван");
//                Thread.currentThread().interrupt(); // uncomment to fix
            }
        }
    }

}