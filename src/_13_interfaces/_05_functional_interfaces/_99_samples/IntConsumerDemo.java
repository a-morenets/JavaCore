package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntConsumerDemo {

    public static void main(String[] args) {

        // IntConsumer intConsumer;
        IntConsumer intConsumer = System.out::println;

        IntStream.of(5, 2, 8, 4, 7)
                .forEachOrdered(intConsumer);
    }

}
