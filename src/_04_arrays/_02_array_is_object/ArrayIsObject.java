package _04_arrays._02_array_is_object;

/**
 * Array of Object type
 * Created by Oleksii on 20.07.2017.
 */
public class ArrayIsObject {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Object o = a;
        if (o instanceof int[]) {
            for (int i = 0; i < ((int[]) o).length; i++) {
                System.out.println(((int[]) o)[i]);
            }
        }
    }

}
