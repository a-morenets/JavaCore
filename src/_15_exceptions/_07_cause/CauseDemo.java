package _15_exceptions._07_cause;

/**
 * Created by user on 20.10.2014.
 */
public class CauseDemo {

	public static void doSmth(int num) {
		int res = -100;
		try {
			res /= num;
		} catch (ArithmeticException exArithmetic) {
			try {
				throw new Exception("Something wrong.", exArithmetic);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			System.out.println("Зачистка мусора");
		}
		System.out.println("res = " + (num == 0 ? "Деление на 0" : res));
	}

	public static void main(String[] args) {
		doSmth(50);
		doSmth(0);
	}

}
