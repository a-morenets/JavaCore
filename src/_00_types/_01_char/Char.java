package _00_types._01_char;

/**
 * char type
 *
 * Created by Oleksii on 20.07.2017.
 */
public class Char {

    public static void main(String[] args) {

        /* char - number representation */

        char charDec, charBin, charOct, charHex;

        // decimal
        charDec = 65535;
        System.out.println((int) charDec);

        // binary
        charBin = 0b11111111_11111111; // positive, because char is unsigned
        System.out.println((int) charBin);

        // octal
        charOct = 0177777;
        System.out.println((int) charOct);

        // hexadecimal
        charHex = 0xffff;
        System.out.println((int) charHex);

        System.out.println("Range of char: " + (int) Character.MIN_VALUE + ".." + (int) Character.MAX_VALUE);

        /* char - character representation */

        // character
        char ch = 'Z'; // character 'Z'
        System.out.println(ch);
        ch = 'U' + 5; // character 'Z'
        System.out.println(ch);

        // decimal
        ch = 90; // character 'Z'
        System.out.println(ch);

        // octal
        ch = '\132'; // character 'Z'
        System.out.println(ch);

        // hexadecimal
        ch = '\u005a'; // character 'Z'
        System.out.println(ch);

        // escape characters
        ch = '\\'; // character '\'
        System.out.println(ch);

/*		System.out.println('\u000D'); // invalid char constant - CR - even in comment like this */

        // removing the space character leads to syntax error, even in comment -> "c:\ users"

        // see also http://ru.wikipedia.org/wiki/UTF-16)
    }

}
