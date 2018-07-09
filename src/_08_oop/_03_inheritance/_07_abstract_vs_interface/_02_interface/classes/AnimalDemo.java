package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.classes;

import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanEat;

public class AnimalDemo {

    public static void main(String[] args) {

        // Inherit static field from CanDrink interface.
        System.out.println("Drink " + Cat.SEVENUP);

        // Create CanEat object
        // via constructor of Cat.
        CanEat canEat1 = new Cat("Tom");

        // An object declared as CanEat.
        // But in fact is Mouse.
        CanEat canEat2 = new Mouse();

        // Polymorphism shown here.
        // Java know the actual types of objects.
        // ==> Tom cat eat ...
        canEat1.eat();
        // ==> Mouse eat ...
        canEat2.eat();

        boolean isCat = canEat1 instanceof Cat;

        System.out.println("catEat1 is Cat? " + isCat);

        // Cast
        if (canEat2 instanceof Mouse) {
            Mouse mouse = (Mouse) canEat2;

            // Call drink method (Inherited from CanDrink).
            mouse.drink();
        }

    }
}