package _01_literals;

/**
 * Literals samples
 *
 * Created by Oleksii on 20.07.2017.
 */
public class Literals {

    public static void main(String[] args) {
        byte b = 0b01010101; // binary
        short sh = 0127; // octal
        int i = 2_000_000_000; // decimal
        long n = -0xFFFFFFFFL; // hexadecimal

        float f = 0x1.0p-3f; // 0.125
        double d = -123_456_789e-3_0_0;

        char ch = 'a';
        ch = '\141'; // 'a' (octal)
        ch = '\u0061'; // 'a' (hexadecimal)
        ch = '\ua432'; // japanese katakana
        ch = '\ucafe'; // 0xCAFE
        ch = '\n'; // CR

        boolean boolTrue = true;
        boolean boolFalse = false;

        String s = "";
        s = "two\nlines";
        s = "\"This is in quotes\"";
    }

}
