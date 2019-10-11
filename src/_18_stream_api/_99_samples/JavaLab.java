package _18_stream_api._99_samples;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class JavaLab {
    /**
     * The method takes a list of names. Returns a string of the form "1. Ivan, 3. Peter ...", only with
     * names on odd indices, respectively.
     */
    @Test
    public void task1() {
        List<String> list = Arrays.asList("Olga", "Ivan", "Oleksii", "Peter", "Anna", "Maria", "Den", "Ali");

        String result = IntStream.range(0, list.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(i -> i + ". " + list.get(i))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    /**
     * The method map list of string to uppercase and then sort descending.
     */
    @Test
    public void task2() {
        List<String> list = Arrays.asList("Olga", "Ivan", "Oleksii", "Peter", "Anna", "Maria", "Den", "Ali");
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    /**
     * Given and collection = Arrays.asList ("1, 2, 0", "4, 5")
     * From the collection get all the numbers listed, separated by commas from all the elements
     */
    @Test
    public void task3() {
        List<String> collection = Arrays.asList("1, 2, 0", "4, 5");
        String numbers = collection.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .collect(Collectors.joining(", "));

        System.out.println(numbers);
    }

    /**
     * Using Stream.iterate, make an infinite stream of random numbers — not by
     * calling Math.random but by directly implementing a linear congruential generator. In such a
     * generator, you start with x[0] = seed and then produce x[n + 1] = 1 (a x[n] + c) % m, for
     * appropriate values of a, c, and m. You should implement a method with parameters a, c, m,
     * and seed that yields a Stream<Long>. Try out a = 25214903917, c = 11, and m = 2^48.
     */
    @Test
    public void task4() {
        LongStream endlessRandomNumbersStream = getEndlessRandomNumbersStream(0, 25214903917L, 11, (long) Math.pow(2, 48));
        endlessRandomNumbersStream.forEach(System.out::println);
    }

    private static LongStream getEndlessRandomNumbersStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(10)
                .mapToLong(x -> x);
    }

    /**
     * Write a method public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) that
     * alternates elements from the stream first and second, stopping when one of them runs out of
     * elements.
     */
    @Test
    public void task5() {

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> ls1 = first.collect(Collectors.toList());
        List<T> ls2 = second.collect(Collectors.toList());
        Stream.Builder<T> sb = Stream.builder();
        for (int i = 0; i < Math.min(ls1.size(), ls2.size()); i++) {
            sb.accept(ls1.get(i));
            sb.accept(ls2.get(i));
        }

        return sb.build();
    }

    @Test
    public void parseString() {
        Arrays.stream("ssdfgdf ojihoih uytutyr sd vnmbvmn tr kif uyrtutyr hgjhsgdfkjghsdfjhg j jhgs sd".split("\\s+"))
                .filter(s -> s.length() < 5)
                .distinct()
                .forEach(System.out::println);
    }
}
