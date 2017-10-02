package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntUnaryOperatorDemo {

    public static void main(String[] args) {

        // IntUnaryOperator intUnaryOperator;
        IntUnaryOperator intUnaryOperator = i -> i * i;

        int[] arr = new int[20];
        Arrays.setAll(arr, intUnaryOperator);
        System.out.println(Arrays.toString(arr));
    }

}
