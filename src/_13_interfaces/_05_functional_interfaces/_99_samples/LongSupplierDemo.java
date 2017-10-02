package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

public class LongSupplierDemo {

    public static void main(String[] args) {

        // LongSupplier longSupplier;
        LongSupplier longSupplier = () -> (long) ((Math.random() * 1_000_000));

        LongStream.generate(longSupplier)
                .limit(5)
                .forEach(System.out::println);
    }

}
