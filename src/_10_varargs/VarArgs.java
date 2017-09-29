package _10_varargs;

public class VarArgs {

	public static void main(String[] args) {
		int n = 5;
		System.out.printf("%d %s", new Object[] { new Integer(n), "widgets" });
		System.out.println();
		System.out.println("max = " + max(234, 465, 123, 798, 234, 75));
	}

	public static double max(double... values) {
		double largest = Double.MIN_VALUE;
		for (double v : values)
			if (v > largest)
				largest = v;
		return largest;
	}

}
