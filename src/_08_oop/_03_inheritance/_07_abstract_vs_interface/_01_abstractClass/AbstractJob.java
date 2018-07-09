package _08_oop._03_inheritance._07_abstract_vs_interface._01_abstractClass;

// An abstract class (Simulating a job). 
// There are two methods declared abstract.
public abstract class AbstractJob {

    public AbstractJob() {

    }

    // This is an abstract method.
    // return Job Name.
    public abstract String getJobName();

    // This is an abstract method.
    public abstract void doJob();

}