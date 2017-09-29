package _08_oop._03_inheritance._00_inheritance;

public class Manager extends Employee {
	private double bonus; // new instance variable

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	// Overrides method from Employee
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	// New method
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
