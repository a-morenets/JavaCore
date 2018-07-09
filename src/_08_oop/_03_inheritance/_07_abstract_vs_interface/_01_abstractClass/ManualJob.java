package _08_oop._03_inheritance._07_abstract_vs_interface._01_abstractClass;

// AbstractJob class has two abstract methods.
// This class implements only one abstract method of parent class. 
// Therefore it must be declared as abstract.
public abstract class ManualJob extends AbstractJob {

    public ManualJob() {

    }

    // Implements abstract method of parent class.
    @Override
    public String getJobName() {
        return "Manual Job";
    }

}