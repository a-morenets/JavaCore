package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

public class IntToDoubleFunctionDemo {

    public static void main(String[] args) {

        // IntToDoubleFunction intToDoubleFunction;
        IntToDoubleFunction intToDoubleFunction = value -> 1.0 / value;

        IntStream.range(0, 10)
                .mapToDouble(intToDoubleFunction)
                .forEach(System.out::println);
    }

}
