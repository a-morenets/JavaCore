package _08_oop._03_inheritance._04_abstract;

public class Student extends Person {
	private String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	// implements abstract Person's method
	public String getDescription() {
		return "a student majoring in " + major;
	}

}
