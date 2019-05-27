package _00_types._02_floats;

/**
 * Float types
 *
 * Created by Oleksii on 13.07.2017.
 */
public class Floats {

    public static void main(String[] args) {

        float t = -1e-2f; // -0.01
        double r = 1.; // 1.0
        r = 1d; // 1.0

        float f;
        f = 0x12.2p2f; // 72.5 (0x12.2 = 18.125; 18.125 * 2^2 = 72.5)
        System.out.println(f);
        System.out.println(java.lang.Float.toHexString(f));
        System.out.println("Range of float: " + java.lang.Float.MIN_VALUE + ".." + java.lang.Float.MAX_VALUE);

        double d;
        d = 0x1.22p6; // 72.5 (0x1.22 = 1.1328125; 1.1328125 * 2^6 = 72.5)
        System.out.println(d);
        System.out.println(Double.toHexString(d));
        System.out.println("Range of double: " + Double.MIN_VALUE + ".." + Double.MAX_VALUE);


        // Special floating values

        System.out.println("\nSpecial floating values");

        f = 1 / 0f;
        System.out.println("f = " + f); // +Infinity
        System.out.println("f == Float.POSITIVE_INFINITY ? " + (f == java.lang.Float.POSITIVE_INFINITY));
        System.out.println("Float.isInfinite(f) ? " + java.lang.Float.isInfinite(f));
        d = 1 / 0d;
        System.out.println("d = " + d); // +Infinity
        System.out.println("f == d ? " + (f == d)); // true
        System.out.println();

        f = 1 / -0f;
        System.out.println("f = " + f); // -Infinity
        System.out.println("f == Float.NEGATIVE_INFINITY ? " + (f == java.lang.Float.NEGATIVE_INFINITY));
        System.out.println("Float.isInfinite(f) ? " + java.lang.Float.isInfinite(f));
        d = 1 / -0d;
        System.out.println("d = " + d); // -Infinity
        System.out.println("f == d ? " + (f == d)); // true
        System.out.println();

        f = 0 / 0f;
        System.out.println("f = " + f); // NaN
        d = 0 / 0d;
        System.out.println("d = " + d); // NaN
        System.out.println("f == d ? " + (f == d)); // false
        System.out.println("Floats.isNaN(f) ? " + java.lang.Float.isNaN(f));
        System.out.println("Double.isNaN(d) ? " + Double.isNaN(d));
        System.out.println("NaN == NaN ? " + (f == d));

        // float/double precision

        System.out.println("\nfloat/double precision");
        double resFloat = 1 / 3f; // result - float
        System.out.println("float 1/3 = " + resFloat);
        double resDouble = 1 / 3d; // result - double
        System.out.println("double 1/3 = " + resDouble);
        System.out.println("(float 1/3) > (double 1/3) ? " + (resFloat > resDouble));

        System.out.println();
        System.out.println("2.0 - 1.1 = " + (2.0 - 1.1));
        System.out.println("2.0 - 1.1 == 0.9 ? " + (2.0 - 1.1 == 0.9)); // false

        System.out.println();
        System.out.println("2.0f - 1.1f = " + (2.0f - 1.1f));
        System.out.println("2.0f - 1.1f == 0.9f ? " + (2.0f - 1.1f == 0.9f)); // false

        // Precisions

        float valF = 0f;
        for (int i = 0; i < 100000; i++) {
            valF = valF + 0.1f;
            System.out.println(valF);
        }

        double valD = 0f;
        for (int i = 0; i < 100000; i++) {
            valD = valD + 0.1d;
            System.out.println(valD);
        }
    }

}
