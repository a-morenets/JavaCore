package _13_interfaces._00_usage;


public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	/**
	 * Two-arguments constructor
	 * @param salary
	 */
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
	
}
