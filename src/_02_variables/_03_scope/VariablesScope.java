package _02_variables._03_scope;

/**
 * Scopes of variables
 *
 * Created by Oleksii on 20.07.2017.
 */
public class VariablesScope {

    public static void main(String[] args) {
        // count = 100; // error: variable is not visible before its definition
        int count;

        int x; // is visible in whole main() method
        x = 10;

        // new scope:
        {
//            double x; // error: duplicate identifier x
        }

        // new scope:
        if (x == 10) {
            int y = 20; // is visible only in if-block
            System.out.println("x = " + x + ", y = " + y);
        }
        // y = 100; // error - y is not visible here
        System.out.println("x = " + x);
    }

}
