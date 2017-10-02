package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class IntFunctionDemo {

    public static void main(String[] args) {

        // IntFunction<R> intFunction;
        IntFunction<IntStream> intFunction = value -> IntStream.range(0, value);

        IntStream.of(5, 7, 2, 1, 9)
                .flatMap(intFunction)
                .forEach(System.out::println);
    }

}
