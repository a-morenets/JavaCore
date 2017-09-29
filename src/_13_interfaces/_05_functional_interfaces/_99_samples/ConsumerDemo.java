package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        //		Consumer<T> consumer;
        Consumer<Integer> consumer;

        String[] arr = {"asf", "5rhtyh", "ysdfg"};
        Arrays.stream(arr).forEach(System.out::println);
    }

}
