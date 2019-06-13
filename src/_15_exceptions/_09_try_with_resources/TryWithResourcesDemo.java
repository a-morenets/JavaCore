package _15_exceptions._09_try_with_resources;

import java.util.Scanner;

public class TryWithResourcesDemo {

	public static void main(String[] args) {

		// Scanner implements Closeable interface that extends AutoCloseable:
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String s = sc.nextLine();
			System.out.println("You entered:");
			System.out.println(s);
		}
		System.out.println("Scanner was auto-closed");
	}

}
