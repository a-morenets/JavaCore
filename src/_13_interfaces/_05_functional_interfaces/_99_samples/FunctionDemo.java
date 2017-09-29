package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionDemo {

    public static void main(String[] args) {

        // Function<T, R> function;
        Function<String, Integer> function = s -> Integer.parseInt(s.substring(1));

        Stream.of("a1", "b2", "c3")
                .map(function)
                .forEach(System.out::println);
    }

}
