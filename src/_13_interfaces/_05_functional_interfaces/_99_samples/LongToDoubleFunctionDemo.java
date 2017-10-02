package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongToDoubleFunction;
import java.util.stream.LongStream;

public class LongToDoubleFunctionDemo {

    public static void main(String[] args) {

        // LongToDoubleFunction longToDoubleFunction;
        LongToDoubleFunction longToDoubleFunction = value -> value / 10.0;

        LongStream.range(0, 10)
                .mapToDouble(longToDoubleFunction)
                .forEach(System.out::println);
    }

}
