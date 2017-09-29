package _15_exceptions._08_my_exception;

class MyEcxeptionDemo extends Exception {
	private int detail;

	public MyEcxeptionDemo(int detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MyEcxeption [detail=" + detail + "]";
	}
		
}

class MyExceptionDemo {
	
	static void compute(int a) throws MyEcxeptionDemo {
		System.out.println("Method compute(" + a + ")");
		if (a > 10)
			throw new MyEcxeptionDemo(a);
		System.out.println("Normal finish");
	}
	
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch (MyEcxeptionDemo e) {
			System.out.println("Exception caught: " + e);
		}
	}
	
}