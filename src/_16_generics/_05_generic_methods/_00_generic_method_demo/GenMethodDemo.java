package _16_generics._05_generic_methods._00_generic_method_demo;

public class GenMethodDemo {

	static <T, V extends T> boolean isIn(T value, V[] array) {
		for (V val : array) {
			if (val.equals(value))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5 };
		if (GenMethodDemo.isIn(2, nums))
			System.out.println("2 is in array");
		if (!isIn(7, nums))
			System.out.println("7 is NOT in array");
		System.out.println();

		String[] strs = { "one", "two", "three", "four", "five" };
		if (isIn("two", strs))
			System.out.println("two is in array");
		if (!isIn("seven", strs))
			System.out.println("seven is NOT in array");
		System.out.println();

	}

}
