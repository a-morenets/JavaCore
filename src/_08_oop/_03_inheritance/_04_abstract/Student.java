package _08_oop._03_inheritance._04_abstract;

public class Student extends Person {
	private String major;

	public Student(String name, String major) {

		// Call the default Constructor of the parent class (Person).
		// For the purpose of assigning values to fields of superclass.
		super(name);

        // Next, Assign values to its fields.
		this.major = major;
	}

	// implements abstract Person's method
	public String getDescription() {
		return "a student majoring in " + major;
	}

}
