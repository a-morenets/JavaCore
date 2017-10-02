package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {

    public static void main(String[] args) {

        // Predicate<T> predicate;
        Predicate<String> predicate = s -> s.length() > 2;

        Stream.of("1", "02", "003")
                .filter(predicate)
                .forEach(System.out::println);
    }

}
