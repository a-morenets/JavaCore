package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.classes;

import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanDrink;
import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanEat;

// This class extends Animal and implements CanEat, CanDrink interfaces.
// This class is not declared as abstract.
// So it must implements all abstract methods of the interfaces.
public class Cat extends Animal implements CanEat, CanDrink {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Implements method of CanMove
    @Override
    public void back() {
        System.out.println(name + " cat back ...");
    }

    // Implements method of CanMove.
    @Override
    public int getVelocity() {
        return 110;
    }

    // Implements method of CanEat.
    @Override
    public void eat() {
        System.out.println(name + " cat eat ...");
    }

    // Implements method of CanDrink.
    @Override
    public void drink() {
        System.out.println(name + " cat drink ...");
    }

}