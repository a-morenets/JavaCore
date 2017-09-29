package _02_variables._02_final;

/**
 * final variable sample
 *
 * Created by Oleksii on 20.07.2017.
 */
public class FinalVariables {
    public static final double PI = 3.14; // can be accessed from another class: double someVar = Integers.PI;

    public static void main(String[] args) {
        final double area;
        double radius = 5;

        area = PI * radius * radius; // 78.5
        System.out.println(area);
//        area ++; // area is final variable - can be initialized once
    }

}
