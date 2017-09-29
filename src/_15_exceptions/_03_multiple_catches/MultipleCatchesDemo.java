package _15_exceptions._03_multiple_catches;

public class MultipleCatchesDemo {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int[] c = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Division by zero: " + e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds: " + e);
		}
		System.out.println("After try-catch");
	}

}
