package _16_generics._02_extends;

class Stats<T extends Number> {
	T[] nums;

	public Stats(T[] nums) {
		this.nums = nums;
	}

	double average() {
		double sum = 0.0;
		for (T num : nums) {
			sum += num.doubleValue();
		}
		return sum / nums.length;
	}

}

public class BoundsExtendsDemo {

	public static void main(String[] args) {
		Integer[] iNums = { 1, 2, 3, 4, 5 };
		Stats<Integer> iOb = new Stats<>(iNums);
		double v = iOb.average();
		System.out.println("Average of iOb = " + v);

		Double[] dNums = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Stats<Double> dOb = new Stats<>(dNums);
		double w = dOb.average();
		System.out.println("Average of dOb = " + w);

		// String does not extend class Number:	
//		String[] sNums = { "1.0", "2.0", "3.0", "4.0", "5.0" };
//		Stats<String> sOb = new Stats<>(sNums);
//		double x = sOb.average();
//		System.out.println("Average of dOb = " + x);
	}

}
