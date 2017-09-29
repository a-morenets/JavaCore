package _08_oop._03_inheritance._01_encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {
        First f = new Second();
        f.addFive(); // prints second
        System.out.println(f.publicValue); // prints 1 (from First class) - no encapsulation (val is public field)
        System.out.println(f.GetValue()); // prints 7 (from Second class) - val encapsulated (private + getter/setter)
    }

}
