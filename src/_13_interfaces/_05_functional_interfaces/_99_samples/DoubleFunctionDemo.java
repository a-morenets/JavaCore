package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.Arrays;
import java.util.function.DoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DoubleFunctionDemo {

    public static void main(String[] args) {
        double[] arr = {5.2, 1.0, 3.1};

        //		DoubleFunction<R> doubleFunction;
        DoubleFunction<DoubleStream> doubleFunction = value -> DoubleStream.of(arr);

        Arrays.stream(arr)
                .flatMap(doubleFunction)
                .forEach(value -> System.out.println(value + ": "));
    }

}
