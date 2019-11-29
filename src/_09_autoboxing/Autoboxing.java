package _09_autoboxing;

public class Autoboxing {

	public static void main(String[] args) {
		Integer n = 0;
		n++; // 1

		Integer a = 1000;
		Integer b = 1000;
		System.out.println(a == b); // false - a and b are different objects

		a = 127;
		b = 127;
		System.out.println(a == b); // true

		n = 1;
		Double x = 2.0;
		System.out.println(true ? n : x); // выводится значение 1.0

		n = null;
//		System.out.println(2 * n); // NullPointerException
		
		// Integer is immutable:
		int i = 5;
		triple(i);
		System.out.println("i = " + i);
		Integer z = 5;
		triple(z);
		System.out.println("z = " + z);
	}

	public static void triple(int x) { // не сработает!
		x++; // попытка модифицировать локальную переменную
	}

	public static void triple(Integer x) { // не сработает!
		x++; // попытка модифицировать локальную переменную
	}
}
