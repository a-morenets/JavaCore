package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.classes;

import _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces.CanMove;

// This class extends from Object.
// And implements CanMove interface.
// CanMove has 3 abstract methods.
// This class implements only one abstract method of CanMove.
// Therefore it must be declared as abstract.
// The remaining abstract methods to be implemented in the subclasses.
public abstract class Animal implements CanMove {

    // Implements run() method of CanMove.
    @Override
    public void run() {
        System.out.println("Animal run...");
    }

}