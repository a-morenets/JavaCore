package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BinaryOperatorDemo {

    public static void main(String[] args) {

        // BinaryOperator<T> binaryOperator;
        BinaryOperator<Integer> binaryOperator = (v1, v2) -> v1 + v2;

        Map<Character, Integer> charsFreqMap = "abcbbccbab".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), v -> 1, binaryOperator));

        System.out.println("charsFreqMap = " + charsFreqMap);
    }

}
