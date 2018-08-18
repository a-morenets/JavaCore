package _04_arrays._03_different_types;

/**
 * Array of different types
 * <p>
 * Created by Oleksii on 20.07.2017.
 */
public class ArrayDifferentTypes {

    public static void main(String[] args) {
        Object[] o = new Object[3];

        int[] arrInt = {1, 2, 3};

        double[] arrDouble = new double[10];
        arrDouble[4] = arrDouble[7] = 55.55;

        String[] arrString = new String[5];

        // array is an Object:
        o[0] = arrInt;
        o[1] = arrDouble;
        o[2] = arrString;

        // iterate resulting 2D array
        for (Object i : o) {
            if (i instanceof int[])
                for (Object j : (int[]) i) {
                    System.out.print(j + " ");
                }

            if (i instanceof String[])
                for (Object j : (String[]) i) {
                    System.out.print(j + " ");
                }

            if (i instanceof double[])
                for (Object j : (double[]) i) {
                    System.out.print(j + " ");
                }

            System.out.println();
        }
        System.out.println();
    }

}
