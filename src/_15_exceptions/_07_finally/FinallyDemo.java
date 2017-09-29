package _15_exceptions._07_finally;

public class FinallyDemo {

	static void procA() {
		try {
			System.out.println("In procA()");
			throw new RuntimeException("Demo");
		} finally {
			System.out.println("finally in procA()");
		}
	}
	
	static void procB() {
		try {
			System.out.println("In procB()");
			return;
		} finally {
			System.out.println("finally in procB()");
		}
	}
	
	static void procC() {
		try {
			System.out.println("In procC()");
		} finally {
			System.out.println("finally in procC()");
		}
	}
	
	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Ecxeption was caught");
		}
		procB();
		procC();
	}

}
