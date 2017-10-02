package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class IntBinaryOperatorDemo {

    public static void main(String[] args) {

        // IntBinaryOperator intBinaryOperator;
        IntBinaryOperator intBinaryOperator = (left, right) -> left * right;

        int factorial = IntStream.range(1, 11)
                .reduce(1, intBinaryOperator);

        System.out.println("10! = " + factorial);
    }

}
