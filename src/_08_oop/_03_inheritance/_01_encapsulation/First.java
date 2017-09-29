package _08_oop._03_inheritance._01_encapsulation;

public class First {
	int publicValue = 1;
	private int value = 1;

	void addFive() {
		System.out.println("addFive in First");
		value += 5;
	}

	public int GetValue() {
		System.out.println("getValue in First");
		return value;
	}
	
}
