package _08_oop._03_inheritance._04_abstract;

public abstract class Person {
	public abstract String getDescription();

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
