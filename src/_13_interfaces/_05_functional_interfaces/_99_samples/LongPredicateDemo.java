package _13_interfaces._05_functional_interfaces._99_samples;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class LongPredicateDemo {

    public static void main(String[] args) {

        // LongPredicate longPredicate;
        LongPredicate longPredicate = value -> value % 2 == 0;

        boolean isAllEven = LongStream.range(0, 10)
                .allMatch(longPredicate);

        System.out.println("isAllEven = " + isAllEven);
    }

}
