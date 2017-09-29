package _13_interfaces._06_method_references._00_method;

/**
 * Method references
 * http://metanit.com/java/tutorial/9.2.php
 * Created by a-morenets on 24.11.2016.
 */
public class MethodReferencesTest {

    /* This static method can be used as method reference in Predicate */
    private static boolean isPositive(int n) {
        return n > 0;
    }

    /* This non-static method can be used as method reference in Predicate */
    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Sum of numbers with condition
     *
     * @param numbers array of numbers
     * @param func    condition
     * @return sum of numbers with condition
     */
    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.test(i))
                result += i;
        }
        return result;
    }

    /**
     * Demo
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // use lambda expression (sum even numbers only)
        Expression func = n -> n % 2 == 0;
        System.out.println(sum(nums, func)); // 20

        MethodReferencesTest mr = new MethodReferencesTest();

        // use non-static method reference (sum even numbers only)
        func = mr::isEven;
        System.out.println(sum(nums, func)); // 20

        // static method reference (sum positive numbers only)
        System.out.println(sum(nums, MethodReferencesTest::isPositive)); // 45
    }

}