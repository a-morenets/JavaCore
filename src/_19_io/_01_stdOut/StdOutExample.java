package _19_io._01_stdOut;

public class StdOutExample {

	public static void main(String[] args) {
		int i = 10;
		float f = 12.345f;
		boolean b = false;
		
		System.out.printf("%-10s: %s, %s%d, %s%5.2f, %s%b", "String", "qwerty", "An integer: ", i, "A float: ", f, "Boolean: ", b);
	}

}
