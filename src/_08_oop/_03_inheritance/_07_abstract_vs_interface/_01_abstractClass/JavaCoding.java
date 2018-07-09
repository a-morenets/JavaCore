package _08_oop._03_inheritance._07_abstract_vs_interface._01_abstractClass;

// Class implements all abstract methods of the parent class.
public class JavaCoding extends AbstractJob {

    public JavaCoding() {
    }

    // Implements abstract method of parent class.
    @Override
    public void doJob() {
        System.out.println("Coding Java...");
    }

    // Implements abstract method of parent.
    // Method with body.
    // Return name of Job.
    @Override
    public String getJobName() {
        return "Coding Java";
    }

}