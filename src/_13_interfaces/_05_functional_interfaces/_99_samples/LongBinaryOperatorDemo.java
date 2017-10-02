package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class LongBinaryOperatorDemo {

    public static void main(String[] args) {

        // LongBinaryOperator longBinaryOperator;
        LongBinaryOperator longBinaryOperator = (left, right) ->
                left % 2 == 0 ? left + right : right - left;

        long result = LongStream.range(0, 10)
                .reduce(longBinaryOperator)
                .orElseGet(() -> -1);

        System.out.println("result = " + result);
    }

}
