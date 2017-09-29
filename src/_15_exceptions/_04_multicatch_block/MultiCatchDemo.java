package _15_exceptions._04_multicatch_block;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int[] c = { 1 };
			c[42] = 99;
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println("Division by zero OR Index out of bounds: " + e);
		}
		System.out.println("After try-catch");
	}

}
