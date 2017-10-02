package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;

public class LongUnaryOperatorDemo {

    public static void main(String[] args) {

        // LongUnaryOperator longUnaryOperator;
        LongUnaryOperator longUnaryOperator = operand -> operand * 10;

        LongStream.range(0, 10)
                .map(longUnaryOperator)
                .forEach(System.out::println);
    }

}
