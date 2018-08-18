package _04_arrays._00_1D;

/**
 * Usage of 1D arrays
 *
 * Created by Oleksii on 20.07.2017.
 */
public class Array1D {

    public static void main(String[] args) {
        int[] a;
        int[] b = new int[10]; // initialized with default values (zeroes for int type)
        b[3] = b[5] = 7;
        int c[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        byte[] bigArray = new byte[Integer.MAX_VALUE]; // OutOfMemoryError
//        byte[] bigArray = new byte[Integer.MAX_VALUE + 1]; // NegativeArraySizeException

//        int value = c[10]; // error: out of bounds
        int val = b[5]; // 7

        // iterate whole array
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        // iterate array by index
        for (int i = c.length - 1; i >= 0; i -= 2) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

}
