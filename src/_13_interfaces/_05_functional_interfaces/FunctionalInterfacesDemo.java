package _13_interfaces._05_functional_interfaces;

import java.util.Scanner;
import java.util.function.*;

/**
 * Functional interfaces
 * http://metanit.com/java/tutorial/9.3.php
 * Created by a-morenets on 24.11.2016.
 */
public class FunctionalInterfacesDemo {

    /**
     * {@link Predicate}
     * @param condition
     * @param testValue
     * @return
     */
    private static boolean checkCondition(Predicate<Integer> condition, int testValue) {
        return condition.test(testValue);
    }

    /**
     * {@link BinaryOperator}
     * @param op
     * @param t1
     * @param t2
     * @return
     */
    private static double biOperation(BinaryOperator<Double> op, double t1, double t2) {
        return op.apply(t1, t2);
    }

    /**
     * {@link UnaryOperator}
     * @param op
     * @param t
     * @return
     */
    private static float unOperation(UnaryOperator<Float> op, float t) {
        return op.apply(t);
    }

    /**
     * {@link Function}
     * @param function
     * @param s
     * @return
     */
    private static int cast(Function<String, Integer> function, String s) {
        return function.apply(s);
    }

    /**
     * {@link Consumer}
     * @param consumer
     */
    private static void doSmth(Consumer<Integer> consumer, int i) {
        consumer.accept(i);
    }

    /**
     * {@link Supplier}
     * @param stringSupplier
     * @return
     */
    private static String getEnteredText(Supplier<String> stringSupplier) {
        return stringSupplier.get();
    }

    /**
     * Demo
     * @param args
     */
    public static void main(String[] args) {

        /* Predicate<T> */
        // test if positive
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(checkCondition(isPositive, -1)); // false
        System.out.println(checkCondition(isPositive, +1)); // true
        // test if x > 0 && x < 10
        Predicate<Integer> rangeCondition = x -> x > 0;
        System.out.println(checkCondition(rangeCondition.and(x -> x < 10), -5)); // false
        // test if x > 0 && x < 10 OR x > 100
        System.out.println(checkCondition(rangeCondition.or(x -> x > 100), 100500)); // true

        /* BinaryOperator<T> */
        // multiply biOperation
        BinaryOperator<Double> multiply = (x, y) -> x * y;
        System.out.println(biOperation(multiply, 2, 3)); // 6.0

        /* UnaryOperator<T> */
        // sqr operation
        UnaryOperator<Float> sqrX = x -> x * x;
        System.out.println(unOperation(sqrX, 3)); // 9.0

        /* Function<T, R> */
        // cast String -> Integer
        Function<String, Integer> strToInt = Integer::parseInt;
        System.out.println(cast(strToInt, "100500")); // 100500 (int)

        /* Consumer<T> */
        // print sqr(x) from 0 to x inclusive
        Consumer<Integer> printSquares = x -> {
            for (int i = 0; i <= x; i++) System.out.println(unOperation(sqrX, i));
        };
        doSmth(printSquares, 5); // squares from 0 to 5 inclusive

        /* Supplier<T> */
        // return entered String
        Supplier<String> supplier = () -> {
            String name;
            try(Scanner kb = new Scanner(System.in)) {
                System.out.print("Input your name: ");
                name = kb.nextLine();
                return "Hello, " + name + "!";
            }
        };
        System.out.println(getEnteredText(supplier)); // Hello, {your input}!
    }
    
}
