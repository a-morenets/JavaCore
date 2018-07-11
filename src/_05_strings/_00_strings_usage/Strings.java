package _05_strings._00_strings_usage;

/**
 * Strings
 *
 * Created by Oleksii on 21.07.2017.
 */
public class Strings {

	public static void main(String[] args) {
		String s; // not initialized
		String nullString = null;
		String empty = "";
		String newString = new String(); // ""

		char[] charArray = { 'h', 'e', 'l', 'l', 'o' };
		newString = new String(charArray);

		String greeting = "Hello";
		newString = new String("world");

		// substring()
		s = greeting.substring(0); // whole word
		s = greeting.substring(0, 5); // whole word
		s = greeting.substring(1, 3); // "el"

		// concatenation
		s = nullString + greeting;
		System.out.println(s); // nullHello

		// String.join()
		empty = String.join(" / ", "A", "B", "C"); // "A / B / C"
		System.out.println(empty);

		// "someString".some_StringMethod()
		System.out.println("".isEmpty());
	}

}
