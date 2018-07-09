package _08_oop._03_inheritance._07_abstract_vs_interface._00_Example;

// This is an abstract class.
// It must be declared as abstract because it has an abstract method.
public abstract class ClassA {

    // This is an abstract method
    // It has no body.
    // Its access modifier is public
    public abstract void doSomething();

    // The access modifier of this method is protected.
    protected abstract String doNothing();

    // This method does not declare access modifier
    // It has the default access modifier.
    abstract void todo();
}

