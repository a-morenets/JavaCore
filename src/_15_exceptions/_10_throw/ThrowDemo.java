package _15_exceptions._10_throw;

public class ThrowDemo {

	static void demoProc() {
		try {
			throw new NullPointerException("Demo");
		} catch (NullPointerException e) {
			System.out.println("NPE was caught in demoProc()");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			demoProc();
		} catch (NullPointerException e) {
			System.out.println("Caught again in main()");
		}
	}

}
