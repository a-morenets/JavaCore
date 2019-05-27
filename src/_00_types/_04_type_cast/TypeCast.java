package _00_types._04_type_cast;

/**
 * Type cast examples
 */
public class TypeCast {

	public static void main(String[] args) {

		// Q: Is there difference?
//		int v1 = 1; long v2 = 2; v1 = v1 + v2; // A: Cannot convert from long (v1 + v2) to int (v1)
		int v1 = 1; long v2 = 2; v1 += v2; // correct
		System.out.println(v1); // 3L

		// Q: what will be the result?
		byte b = 1;
//		byte c = b + 1; // A: cannot convert int (b + 1) to byte (c)
		
		// Q: what will be the result?
		int x = 1;
		System.out.println("x = " + x); // "x = 1"
		System.out.println(1 + 2 + "text"); // "3text"
		System.out.println("text" + 1 + 2); // "text12"

		/* byte -> short -> int -> long -> float -> double */

		double y;
		byte xx = 0;
		y = xx + 5;
        System.out.println(y); // 5.0d

        /* Types promotion
         * 1) bb -> float
         * 2) result of (f * bb) is float
         * 3) c -> int
         * 4) result of (i / c) is int
         * 5) s -> double
         * 6) result of (d * s) is double
         * 7) result of 2(float) + 4(int) is float
         * 8) result of 7(float) - 6(double) is double
         */
        byte bb = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * bb) + (i / c) - (d * s);
        System.out.println((f * bb) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);

        /* byte <- short <- char <- int <- long <- float <- double */

        xx = 71;
        char symbol = (char) xx; // 'G'
        System.out.println(symbol);

        int yy = (int) 77.85; // 77
        System.out.println(yy);

        int a = 200;
        byte res = (byte) a; // -56
        /* Результатом будет число -56.
         В данном случае число 200 вне диапазона для типа byte (от -128 до 127), поэтому произойдет усечение значения.
         Так как тип byte предполагает 256 возможных значений, то полученное значение будет (200 % 256 - 256) = -56
        */
        System.out.println(res);
        System.out.println(a % 256 - 256);

        double aDouble = 56.9898;
        int r = (int) aDouble; // 56
        System.out.println(r);
    }

}
