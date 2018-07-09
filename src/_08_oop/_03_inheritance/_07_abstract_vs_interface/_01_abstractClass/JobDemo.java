package _08_oop._03_inheritance._07_abstract_vs_interface._01_abstractClass;

public class JobDemo {

    public static void main(String[] args) {

        // Create AbstractJob object
        // from Constructor of JavaCoding.
        AbstractJob job1 = new JavaCoding();

        // Call doJob() method.
        job1.doJob();

        // getJobName is the abstract method in AbstractJob class.
        // But it was implemented in a certain subclass (JavaCoding).
        // So can call it.
        String jobName = job1.getJobName();

        System.out.println("Job Name 1= " + jobName);

        // Create AbstractJob object
        // from constructor of BuildHouse.
        AbstractJob job2 = new BuildHouse();

        job2.doJob();

        String jobName2 = job2.getJobName();

        System.out.println("Job Name 2= " + jobName2);

    }
}