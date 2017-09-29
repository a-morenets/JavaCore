package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.DoubleToIntFunction;
import java.util.stream.DoubleStream;

public class DoubleToIntFunctionDemo {

    public static void main(String[] args) {

        // DoubleToIntFunction doubleToIntFunction;
        DoubleToIntFunction doubleToIntFunction = Math::getExponent;

        DoubleStream.of(5.54, 1.23456789, 9)
                .mapToInt(doubleToIntFunction)
                .forEach(System.out::println);
    }

}
