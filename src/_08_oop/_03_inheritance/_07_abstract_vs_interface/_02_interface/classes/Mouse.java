package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.classes;

import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanDrink;
import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanEat;

public class Mouse extends Animal implements CanEat, CanDrink {

    @Override
    public void back() {
        System.out.println("Mouse back ...");
    }

    @Override
    public int getVelocity() {
        return 85;
    }

    @Override
    public void drink() {
        System.out.println("Mouse drink ...");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat ...");
    }

}