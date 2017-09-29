package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.DoubleToLongFunction;
import java.util.stream.DoubleStream;

public class DoubleToLongFunctionDemo {

    public static void main(String[] args) {

        // DoubleToLongFunction doubleToLongFunction;
        DoubleToLongFunction doubleToLongFunction = Math::round;

        DoubleStream.of(5.54, 1.23456789, 9)
                .mapToLong(doubleToLongFunction)
                .forEach(System.out::println);
    }

}
