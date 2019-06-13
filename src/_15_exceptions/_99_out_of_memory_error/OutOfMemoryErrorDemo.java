package _15_exceptions._99_out_of_memory_error;

public class OutOfMemoryErrorDemo {

	private static final int SIZE = 1024 * 1024;

	public static void main(String[] args) {
		Object[] tail = null;
		int i = 0;

		while (true) {
			System.out.println(i++);
			tail = new Object[] { tail, new Object[SIZE] };
		}
	}

}
