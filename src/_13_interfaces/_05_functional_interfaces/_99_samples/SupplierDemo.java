package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Objects;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        // Supplier<T> supplier;
        Supplier<String> supplier = () -> "NULL!";

        Object o = Objects.requireNonNull(null, supplier); // NPE

        System.out.println("o = " + o);
    }

}
