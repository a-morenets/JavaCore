package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntPredicateDemo {

    public static void main(String[] args) {

        // IntPredicate intPredicate;
        IntPredicate intPredicate = value -> value < 50;

        IntStream.generate(() -> (int) (Math.random() * 100))
                .limit(10)
                .filter(intPredicate)
                .forEach(System.out::println);
    }

}
