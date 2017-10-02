package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class IntSupplierDemo {

    public static void main(String[] args) {

        // IntSupplier intSupplier;
        IntSupplier intSupplier = () -> (int) (Math.random() * 100);

        IntStream.generate(intSupplier)
                .limit(10)
                .forEach(System.out::println);
    }

}
