package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorDemo {

    public static void main(String[] args) {

        // DoubleBinaryOperator doubleBinaryOperator;
        DoubleBinaryOperator doubleBinaryOperator = ((left, right) -> left + right);

        double[] arr = {2.0, 1.0, 0.0, 3.0};

        Arrays.parallelPrefix(arr, doubleBinaryOperator);
        System.out.println(Arrays.toString(arr)); // [2.0, 3.0, 3.0, 6.0]
    }

}
