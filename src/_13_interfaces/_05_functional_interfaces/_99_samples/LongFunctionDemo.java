package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongFunction;
import java.util.stream.LongStream;

public class LongFunctionDemo {

    public static void main(String[] args) {

        // LongFunction<R> longFunction;
        LongFunction<String> longFunction = value -> "str_" + String.valueOf(value);

        LongStream.rangeClosed(1, 10)
                .mapToObj(longFunction)
                .forEach(System.out::println);
    }

}
