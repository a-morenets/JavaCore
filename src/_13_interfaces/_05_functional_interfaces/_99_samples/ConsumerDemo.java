package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {

    public static void main(String[] args) {

        // Consumer<T> consumer;
        Consumer<String> consumer = System.out::println;

        Stream.of("a1", "a2", "a3")
                .forEach(consumer);
    }

}
