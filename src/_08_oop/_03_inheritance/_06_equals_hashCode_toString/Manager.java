package _08_oop._03_inheritance._06_equals_hashCode_toString;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject))
			return false;
		Manager other = (Manager) otherObject;
		// В методе super.equals() проверяется, принадлежат ли объекты,
		// доступные по ссылкам this и other, одному и тому же классу
		return bonus == other.bonus;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}
	
}
