package _02_variables._01_initialization;

/**
 * Initialization of variables
 *
 * Created by Oleksii on 20.07.2017.
 */
public class VariablesInitialization {

    public static void main(String[] args) {

        // declare a variable
        int vacationDays;
//        System.out.println(vacationDays); // error: variable was not yet initialized

        vacationDays = 12;
        System.out.println(vacationDays); // now OK

        // declare and initialize another variable;
        double salary = 65000.0;
        System.out.println(salary);

        // declare three variables, initialize one of them
        int a, b = 100, c;
        c = a = b; // result: c == 100, a == 100

        boolean bool = true & 0 == 0;
    }

}
