package _00_types._00_integers;

/**
 * Integer types
 *
 * Created by Oleksii on 20.07.2017.
 */
public class Integers {

    public static void main(String[] args) {

        /* byte */

        byte byteDec, byteBin, byteOct, byteHex;

        // decimal
        byteDec = -128;
        System.out.println(byteDec);
        byteDec = 127;
        System.out.println(byteDec);

        // binary
        byteBin = (byte) 0b10000000; // negative
        System.out.println(byteBin);
        byteBin = 0b01111111;
        System.out.println(byteBin);

        // octal
        byteOct = -0200;
        System.out.println(byteOct);
        byteOct = 0177;
        System.out.println(byteOct);

        // hexadecimal
        byteHex = -0x80;
        System.out.println(byteHex);
        byteHex = 0X7f;
        System.out.println(byteHex);

        System.out.println("Range of byte: " + Byte.MIN_VALUE + ".." + Byte.MAX_VALUE);


        /* short */

        short shortDec, shortBin, shortOct, shortHex;

        // decimal
        shortDec = -32768;
        System.out.println(shortDec);
        shortDec = 32767;
        System.out.println(shortDec);

        // binary
        shortBin = (short) 0b10000000_00000000; // negative
        System.out.println(shortBin);
        shortBin = 0B01111111_11111111;
        System.out.println(shortBin);

        // octal
        shortOct = -0100000;
        System.out.println(shortOct);
        shortOct = 077777;
        System.out.println(shortOct);

        // hexadecimal
        shortHex = -0x8000;
        System.out.println(shortHex);
        shortHex = 0x7fff;
        System.out.println(shortHex);

        System.out.println("Range of short: " + Short.MIN_VALUE + ".." + Short.MAX_VALUE);


        /* int */

        int intDec, intBin, intOct, intHex;

        // decimal
        intDec = -2_147_483_648;
        System.out.println(intDec);
        intDec = 2_147_483_647;
        System.out.println(intDec);

        // binary
        intBin = 0b10000000_00000000_00000000_00000000; // negative
        System.out.println(intBin);
        intBin = 0b01111111_11111111_11111111_11111111;
        System.out.println(intBin);

        // octal
        intOct = -0200_0000_0000;
        System.out.println(intOct);
        intOct = 0177_7777_7777;
        System.out.println(intOct);

        // hexadecimal
        intHex = -0x8000_0000;
        System.out.println(intHex);
        intHex = 0x7fff_ffff;
        System.out.println(intHex);

        System.out.println("Range of int: " + Integer.MIN_VALUE + ".." + Integer.MAX_VALUE);


        /* long */

        long longDec, longBin, longOct, longHex;

        // decimal
        longDec = -9_223_372_036_854_775_808L;
        System.out.println(longDec);
        longDec = 9_223_372_036_854_775_807L;
        System.out.println(longDec);

        // binary
        longBin = 0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L; // negative
        System.out.println(longBin);
        longBin = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L;
        System.out.println(longBin);

        // octal
        longOct = -01_000_000_000_000_000_000_000L;
        System.out.println(longOct);
        longOct = 0777_777_777_777_777_777_777L;
        System.out.println(longOct);

        // hexadecimal
        longHex = -0x8000_0000_0000_0000L;
        System.out.println(longHex);
        longHex = 0x7fff_ffff_ffff_ffffL;
        System.out.println(longHex);

        System.out.println("Range of long: " + Long.MIN_VALUE + ".." + Long.MAX_VALUE);
    }

}
