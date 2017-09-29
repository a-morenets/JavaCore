package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.DoubleFunction;
import java.util.stream.DoubleStream;

public class DoubleFunctionDemo {

    public static void main(String[] args) {

        // DoubleFunction<R> doubleFunction;
        DoubleFunction<DoubleStream> doubleFunction = value -> DoubleStream
                .iterate(value, operand -> operand + 1)
                .limit(3);

        DoubleStream.of(5.2, 1.0, 3.1)
                .flatMap(doubleFunction)
                .forEach(System.out::println);
    }

}
