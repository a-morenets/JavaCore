package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongToIntFunction;
import java.util.stream.LongStream;

public class LongToIntFunctionDemo {

    public static void main(String[] args) {

        // LongToIntFunction longToIntFunction;
        LongToIntFunction longToIntFunction = value -> (int) (value / 10);

        LongStream.range(1_000_000, 10_000_000)
                .limit(10)
                .mapToInt(longToIntFunction)
                .forEach(System.out::println);
    }

}