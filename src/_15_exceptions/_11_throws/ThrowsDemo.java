package _15_exceptions._11_throws;

public class ThrowsDemo {

	static void throwOne() throws IllegalAccessException {
		System.out.println("In throwOne()");
		throw new IllegalAccessException("Demo");
	}
	
	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught exception: " + e);
		}
	}

}
