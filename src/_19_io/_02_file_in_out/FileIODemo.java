package _19_io._02_file_in_out;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileIODemo {
	
	public static void main(String args[]) throws IOException {

		// 1. FileInputStream / FileOutputStream
		
		// 1.1
		// Byte streams (FileInputStream / FileOutputStream)
		// Читаем по 1 байту
		try (InputStream fis = new FileInputStream("1.txt");
				OutputStream fos = new FileOutputStream("1_1.txt")) {
			
			int oneByte;
			while ((oneByte = fis.read()) != -1) {
				// т.к. oneByte содержит 1 байт, то правильно печатаются только первые 128 символов ASCII-таблицы:
				System.out.print((char) oneByte); // кириллица выводится В КОНСОЛЬ как ??????????
				fos.write(oneByte); // но в файл пишутся КОРРЕКТНЫЕ байты
			}
			System.out.println("\n========================================================");
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 1.2
		// Byte streams (FileInputStream / FileOutputStream)
		// Читаем байты с помощью буффера размером bufSize:
		try (InputStream is = new FileInputStream("1.txt");
				OutputStream os = new FileOutputStream(new File("1_2.txt"))) {

			int bufSize = 153;
			byte[] buff = new byte [bufSize];
			int numBytes;
			while ((numBytes = is.read(buff)) != -1) { // numBytes = number of bytes read
				System.out.print(numBytes + " ");
				os.write(buff, 0, numBytes);
			}
			System.out.println("\n========================================================");
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 1.3
		// ByteArrayOutputStream
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		buff.write(0);
		buff.write(new byte[] {1, 2, 3});
		buff.write(new byte[] {0, 0, 0, 4, 5, 6, 0, 0, 0}, 3, 3);

		byte[] rawData = buff.toByteArray();
		System.out.println(Arrays.toString(rawData));
		System.out.println("\n========================================================");

		
		// 2. FileReader / FileWriter
		
		// 2.1
		// Character streams (FileReader / FileWriter)
		// Читаем по 1 символу
		try (Reader reader = new FileReader("1.txt");
				Writer writer = new FileWriter(new File("2_1.txt"))) {
			
			int ch;
			while ((ch = reader.read()) != -1) { // ch - символ 0x0000-0xffff
				System.out.println(ch);
				writer.write(ch);
			}
			System.out.println("\n========================================================");
			writer.flush();
			
		} catch (FileNotFoundException exFNF) {
			System.out.println("File not found!");
		} catch (IOException exIO) {
			System.out.println("IO Exception");
		}

		// 2.2
		// Character streams (FileReader / FileWriter)
		// Читаем символы с помощью буффера размером bufSize:
		try (Reader reader = new FileReader("1.txt");
				Writer writer = new FileWriter(new File("2_2.txt"))) {
			
			int bufSize = 57;
			char[] cbuf = new char[bufSize];
			int numBytes;
			while ((numBytes = reader.read(cbuf)) != -1) { // numBytes = number of bytes read
				System.out.println(cbuf); // Может вывести мусор, если последняя читанная порция меньше чем блок
				writer.write(cbuf, 0, numBytes);
			}
			System.out.println("\n========================================================");
			writer.flush();
			
		} catch (FileNotFoundException exFNF) {
			System.out.println("File not found!");
		} catch (IOException exIO) {
			System.out.println("IO Exception");
		}

		// 3.1
		// BufferedInputStream(FileInputStream) / BufferedOutputStream(FileOutputStream)
		// Читаем по 1 байту
		try (InputStream bis = new BufferedInputStream(new FileInputStream("1.txt"));
				OutputStream bos = new BufferedOutputStream(new FileOutputStream("3_1.txt")))
		{
			int oneByte;
			while ((oneByte = bis.read()) != -1) {
				System.out.println(oneByte);
				bos.write(oneByte);
			}
			bos.flush();
			System.out.println("\n========================================================");
			
		} catch (FileNotFoundException exFNF) {
			System.out.println("File not found!");
		} catch (IOException exIO) {
			System.out.println("IO Exception");
		}

		// 3.2
		// BufferedReader(FileReader) / BufferedWriter(FileWriter)
		// Читаем строки построчно с помощью readLine():
		try (BufferedReader reader = new BufferedReader(new FileReader("1.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("3_2.txt")))
//				PrintWriter writer = new PrintWriter(new FileWriter("3_1.txt"));
		{
			String s;
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
				writer.write(s + "\n"); // newline character needed!
//				writer.println(s);
			}
			writer.flush();
			System.out.println("\n========================================================");
			
		} catch (FileNotFoundException exFNF) {
			System.out.println("File not found!");
		} catch (IOException exIO) {
			System.out.println("IO Exception");
		}

		// 4.1
		// Object streams (object must implement Serializable)
		List<User> u1 = new ArrayList<>();
		List<User> u2 = new LinkedList<>();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("User.ser"))) {
			u1.add(new User("Петя", 25));
			u1.add(new User("Коля", 34));
			u1.add(new User("Николай", 53));

			u2.add(new User("Женя", 42));
			u2.add(new User("Александр", 21));

			// write objects one after another
			
			for (User user : u1) {
				oos.writeObject(user);
			}
			
			for (User user : u2) {
				oos.writeObject(user);
			}

			// write whole Lists
			oos.writeObject(u1); // ArrayList
			oos.writeObject(u2); // LinkedList

			// Add some data
			u2.add(new User("+ Александр", 21));
			u2.add(new User("+ Маша", 11));
			u2.add(new User("+ Саша", 24));
			u2.add(new User("+ Олег", 25));
			u2.add(new User("+ Оля", 27));

			// now LinkedList contains 2 + 5 = 7 elements
			oos.writeObject(u2); // LinkedList

			oos.flush();
			System.out.println("Объекты сохранены");
			
		} catch (FileNotFoundException fNFex) {
			System.out.println(fNFex);
		} catch (IOException iOex) {
			System.out.println(iOex);
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("User.ser"))) {

			// read objects one after another
			// IOException will occur when nothing to read
			for (int i = 0; i < 5; i++) {
				User user = (User) ois.readObject();
				System.out.println(user);
			}

			// read whole Lists
			List<User> u1in = null;
			List<User> u2in = null;
			u1in = (List) ois.readObject(); // ArrayList
			u2in = (List) ois.readObject(); // LinkedList
			System.out.println(u1in);
			System.out.println(u2in);

			List<User> u3in = null;
			u3in = (List) ois.readObject(); // LinkedList with added elements
			System.out.println(u3in);

			System.out.println("Объекты восстановлены");
			
		} catch (FileNotFoundException fNFex) {
			System.out.println("FNF Error!");
		} catch (IOException iOex) {
			System.out.println("IO Error!");
		} catch (ClassNotFoundException cNFex) {
			System.out.println("CNF Error!");
		}

		// 5.1
		// Data streams
		System.out.println("------------------------------");
		DataOutput dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream("5_1.txt"));
			for (int i = 0; i < 10; i++) {
				double d = Math.random();
				dout.writeDouble(d);
				System.out.println(d);
			}
//			dout.flush();
//			dout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------");
		DataInput din = null;
		try {
			din = new DataInputStream(new FileInputStream("5_1.txt"));
			for (int i = 0; i < 10; i++) {
				System.out.println(din.readDouble());
			}
//			din.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
