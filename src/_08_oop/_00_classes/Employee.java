package _08_oop._00_classes;

import java.util.Random;

public class Employee {

	// instance variables
	
	private static int nextId;
	
	private final int id; // final variable must be initialized in constructor or init block
	private String name;
	private double salary;

	// Constructors
	
	/**
	 * Two-arguments constructor
	 * @param salary
	 */
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * One-argument constructor
	 * @param salary
	 */
	public Employee(double salary) {
		
		/* Use two-arguments constructor */
		this("Employee #" + nextId, salary);
	}

	/**
	 * Default constructor
	 * If the object is created using default constructor and if there is overloaded constructor with argument(s),
	 * the implicit declaration of default constructor is needed
	 * Otherwise, we can NOT create an object using new Employee();
	 */
	public Employee() {
		// may be empty, all instance variables are initialized with their defaults values (0, false, null)
	}

	// static init block
	static {
		Random generator = new Random();

		/* static variable may be initialized in static init block */
		nextId = generator.nextInt(10_000);
	}
	
	// init block
	{
		id = nextId++;
	}
	
	// methods
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}
	
}
