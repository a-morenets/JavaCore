package _04_arrays._01_2D;

/**
 * Usage of 2D arrays
 *
 * Created by Oleksii on 20.07.2017.
 */
public class Array2D {

    public static void main(String[] args) {
        float[][] a;

        float[] b[] = new float[5][]; // array of five null's
        b[3] = new float[3];

        float c[][] = {{1}, {2, 3, 4}, {5, 6, 7, 8, 9}}; // different sizes

        // iterate all elements of array b
        for (float[] f : b) {
            System.out.print(f + " ");
        }
        System.out.println();

        // iterate all elements of array c
        for (float[] f : c) {
            for (int i = 0; i < f.length; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
