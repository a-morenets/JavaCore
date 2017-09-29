package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BiConsumerDemo {

    public static void main(String[] args) {

        // BiConsumer<T, U> biConsumer
        BiConsumer<Character, Integer> biConsumer = (k, v) -> System.out.println(k + ": " + v);

        "abcbbccbab".chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()))
                .forEach(biConsumer);
    }

}
