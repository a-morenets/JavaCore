package _18_stream_api._99_samples;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSamples {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
//		Stream<Integer> integerStream = Stream.of(arrInt); // error
        Stream<int[]> streamInt = Stream.of(arrInt); // stream of int[] objects!!!
        streamInt.forEach(s -> System.out.println(s + ": " + s.getClass())); // [1, 2, 3]: class [I

        Integer[] arrInteger = {5, 3, null, 4, 9, 7};
        Stream<Integer> integerStream = Stream.of(arrInteger);
        integerStream
                .filter(Objects::nonNull)
                .forEach(s -> System.out.println(s + ": " + s.getClass())); // {value}: class java.lang.Integer

        Stream.of(arrInteger)
                .filter(x -> Integer.valueOf(5).equals(x))
                .forEach(System.out::println);
        // or
        Stream.of(arrInteger)
                .filter(Integer.valueOf(5)::equals) // calls: Integer.valueOf(5).equals(x) - no NPE
                .forEach(System.out::println);

        Integer max = Stream.of(arrInteger)
                .filter(Objects::nonNull)
//                .reduce((a, b) -> Integer.max(a, b)) // or
                .reduce(Integer::max)
                .get();
        System.out.println("max = " + max);

        String[] strings = {"abc", "de", "fghij", "", "klmnop"};
        Stream.of(strings)
                .map(String::toUpperCase)
                .peek((e) -> System.out.print(e + " "))
//                .map(s -> s.length()) // or
//                .map(String::length) // or
                .mapToInt(String::length)
                .forEach(System.out::println);

        String maxString = Stream.of(strings)
//                .max(String::compareTo) // or
//                .max((s1, s2) -> s1.compareTo(s2)) // or
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("maxString = " + maxString);

        // characters frequency:
        String str = "abcbbccbab";
        Map<Character, Long> charsFreqLongMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("charsFreqLongMap = " + charsFreqLongMap);
    }

}
