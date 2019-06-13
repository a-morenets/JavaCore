package _03_operations._01_arithmetic;

import java.util.Arrays;

/**
 * Arithmetic operations
 *
 * Created by Oleksii on 20.07.2017.
 */
public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println(15 / 2); // 7 (int)
        System.out.println(15 % 2); // 1 (int)
        System.out.println(-15 % -2); // -1 (int) - same sign as -15
        System.out.println(15.0 / 2); // 7.5 (double)

        // +=, -=, *=, /=, ...
        int x = 4;
        x -= 2; // 2

        // ++, --
        int y, z;
        y = ++x;
        z = x++;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z); // x = 4, y = 3, z = 3

        x = 0;
        System.out.println(x++ + ++x - x--); // 0
        System.out.println(x); // 1
    }

}
