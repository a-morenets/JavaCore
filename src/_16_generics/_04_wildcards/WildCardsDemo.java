package _16_generics._04_wildcards;

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
	
	boolean sameAvg(Stats<?> ob) {
		return average() == ob.average();
	}

}

public class WildCardsDemo {

	public static void main(String[] args) {
		Integer[] iNums = { 1, 2, 3, 4, 5 };
		Stats<Integer> iOb = new Stats<>(iNums);
		double v = iOb.average();
		System.out.println("Average of iOb = " + v);

		Double[] dNums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dOb = new Stats<>(dNums);
		double w = dOb.average();
		System.out.println("Average of dOb = " + w);

		Float[] fNums = { 1f, 2f, 3f, 4f, 5f };
		Stats<Float> fOb = new Stats<>(fNums);
		double x = fOb.average();
		System.out.println("Average of dOb = " + x);
		
		System.out.println("iOb.sameAvg(dOb) = " + iOb.sameAvg(dOb));
		System.out.println("iOb.sameAvg(fOb) = " + iOb.sameAvg(fOb));
	}

}
