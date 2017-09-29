package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.OptionalDouble;
import java.util.function.DoubleSupplier;

public class DoubleSupplierDemo {

    public static void main(String[] args) {

        // DoubleSupplier doubleSupplier;
        DoubleSupplier doubleSupplier = Math::random;

        OptionalDouble optionalDouble = OptionalDouble.empty();
        double d = optionalDouble.orElseGet(doubleSupplier);
        System.out.println("d = " + d);
    }

}
