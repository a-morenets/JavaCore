package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Random;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class LongConsumerDemo {

    public static void main(String[] args) {

        // LongConsumer longConsumer;
        LongConsumer longConsumer = System.out::println;

        LongStream.range(-5, 5)
                .forEach(longConsumer);
    }

}
