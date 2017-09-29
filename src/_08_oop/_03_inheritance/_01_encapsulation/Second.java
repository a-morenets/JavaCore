package _08_oop._03_inheritance._01_encapsulation;


public class Second extends First {
	int publicValue = 2;
	private int value = 2;

	@Override
	void addFive() {
		System.out.println("addFive in Second");
		value += 5;
	}

	@Override
	public int GetValue() {
		System.out.println("getValue in Second");
		return value;
	}

}
