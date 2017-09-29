package _16_generics._03_super;

import java.time.LocalDate;

public class BoundsSuperDemo {

	public static void main(String[] args) {
		Manager[] managers = { new Manager(), new Executive() };
		Pair<Manager> pairManagers = new Pair<>();
		minMaxBonus(managers, pairManagers);
	}

	public static void minMaxBonus(Manager[] a, Pair<? super Manager> result) {
		if (a == null || a.length == 0)
			return;
		Manager min = a[0];
		Manager max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.getBonus() > a[i].getBonus())
				min = a[i];
			if (max.getBonus() < a[i].getBonus())
				max = a[i];
		}
		result.setFirst(min);
		result.setSecond(max);
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
}

class Manager extends Employee {
	private double bonus; // new instance variable

	public double getBonus() {
		return bonus;
	}
}

class Executive extends Manager {

}

class Pair<T> {
	private T first;
	private T second;

	public Pair() {
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}
}
