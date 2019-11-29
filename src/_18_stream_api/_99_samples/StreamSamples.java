package _18_stream_api._99_samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamSamples {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
//		Stream<Integer> integerStream = Stream.of(arrInt); // error
        Stream<int[]> streamInt = Stream.of(arrInt); // stream of ONE int[] object!!!
        streamInt
                .forEach(s -> System.out.println(Arrays.toString(s) + ": " + s.getClass())); // [1, 2, 3]: class [I

        Integer[] arrInteger = {5, 3, null, 4, 9, 7};
        Stream<Integer> streamInteger = Stream.of(arrInteger);
        streamInteger
                .filter(Objects::nonNull)
                .forEach(s -> System.out.println(s + ": " + s.getClass())); // {value}: class java.lang.Integer

        Stream.of(arrInteger) // Stream<Integer>
//                .filter(x -> x.equals(Integer.valueOf(5))) // NPE if x == null
                .filter(x -> Integer.valueOf(5).equals(x))
                .forEach(System.out::println);
        // or
        Stream.of(arrInteger) // Stream<Integer>
                .filter(Integer.valueOf(5)::equals) // calls: Integer.valueOf(5).equals(x) - no NPE
                .forEach(System.out::println);

        Integer max = Stream.of(arrInteger)
                .filter(Objects::nonNull)
//                .reduce((a, b) -> Integer.max(a, b))
        // or
                .reduce(Integer::max)
                .get();
        System.out.println("max = " + max);

        String[] strings = {"abc", "de", "fghij", "", "klmnop"};
        Stream.of(strings)
                .map(String::toUpperCase)
                .peek(e -> System.out.print(e + " "))
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

        // characters frequencies:
        String str = "abcbbccbab";
        Map<Character, Long> charsFreqLongMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("charsFreqLongMap = " + charsFreqLongMap);

        ///////////////////////
        IntStream.generate(() -> (int) (100 * Math.random()))
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        ///////////////////////
        double[][] doubles = {{5.8, 1.2}, {0.8, 9.9, 6.7}, {5.5}};
        Stream.of(doubles) // Stream<double[]>
                .flatMapToDouble(Arrays::stream) // DoubleStream
                .forEach(System.out::println);

        ////////////////////// Сиракузская последовательность
        IntStream.iterate(1000, i -> i % 2 == 0 ? i / 2 : i * 3 + 1)
                .limit(150)
                .forEach(System.out::println);

        // Factorials
        long n = 6;
        System.out.println(n + "! = " + factorialRec(n));
        System.out.println(n + "! = " + factorialIter(n));

        int[] numbers = {1, 2, 3, 4};
        String commaSeparatedNumbers = Arrays.stream(numbers)
//                .boxed().map(Object::toString)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        String palindromeStr = "qwewq";
        System.out.println("Is palindrome: " + palindromeStr + ": " + isPalindrome(palindromeStr));
        String nonPalindromeStr = "qwerty";
        System.out.println("Is palindrome: " + nonPalindromeStr + ": " + isPalindrome(nonPalindromeStr));
    }

    // Factorial (recursive)
    static long factorialRec(long number) {
        Function<Long, Long> fact = n -> n > 1 ? n * factorialRec(n - 1) : 1;
        return fact.apply(number);
    }

    // Factorial (iterative)
    static long factorialIter(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce((left, right) -> left * right)
                .getAsLong();
    }

    static boolean isPalindrome(String str) {
        return IntStream.range(0, str.length() / 2)
                .allMatch(x -> str.charAt(x) == str.charAt(str.length() - 1 - x));
    }
}
