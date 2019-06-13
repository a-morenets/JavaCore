package _15_exceptions._02_try_catch;

public class TryCatchDemo {

	public static void main(String[] args) {
		int x = 10;
		
		try {
			x = 1 / 0;
			System.out.println("x = " + x); // This will never printed
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After catch");
	}

	// >> / by zero
    // After catch
}
