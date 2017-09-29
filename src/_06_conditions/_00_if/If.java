package _06_conditions._00_if;

public class If {

    public static void main(String[] args) {
        int a = 5;

        // if
        if (a > 0)
            System.out.println("a > 0");

        a = 0;

        // if {}
        if (a > 0) {
            System.out.println(a > 0);
            a = 10;
        }
        System.out.println("a = " + a);

        // if - else
        if (a > 0)
            System.out.println("a > 0");
        else
            System.out.println("a = " + a);

        // if - else if
        if (a > 0)
            System.out.println("a > 0");
        else if (a == 0)
            System.out.println("a == 0");
        else
            System.out.println("a < 0");

        // nested if
        if (a > 0)
            if (a == 1)
                System.out.println("a == 1");
            else
                System.out.println("a > 1");
        else if (a == 0)
            System.out.println("a == 0");
        else
            System.out.println("a < 0");
    }

}
