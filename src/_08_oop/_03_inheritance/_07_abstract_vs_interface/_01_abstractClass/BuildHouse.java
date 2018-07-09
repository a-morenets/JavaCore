package _08_oop._03_inheritance._07_abstract_vs_interface._01_abstractClass;

// This class inherited from ManualJob
// BuildHouse is not declared as abstract.
// so it must implements all remaining abstract methods.
public class BuildHouse extends ManualJob {

    public BuildHouse() {

    }

    // Implements abstract methods of the parent class.
    @Override
    public void doJob() {
        System.out.println("Build a House");
    }

}