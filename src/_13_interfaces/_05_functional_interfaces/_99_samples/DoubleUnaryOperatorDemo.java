package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class DoubleUnaryOperatorDemo {

    public static void main(String[] args) {

        // DoubleUnaryOperator doubleUnaryOperator;
        DoubleUnaryOperator doubleUnaryOperator = Math::ceil;

        DoubleStream.of(-3.3, -2.2, -1.1, 0.0, 1.1, 2.2, 3.3)
                .map(doubleUnaryOperator)
                .forEach(System.out::println);
    }

}
