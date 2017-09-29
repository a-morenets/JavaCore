package _08_oop._03_inheritance._00_inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		// all public methods are reachable from Employee class:
		System.out.println("name=" + boss.getName() + ", salary=" + boss.getSalary());
		
		Employee manager = boss; // Manager is an Employee
//		manager.setBonus(1000); // error - manager is of Employee type

		Employee staff_1 = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		Employee staff_2 = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
//		boss = staff_1; // error - Employee is NOT a Manager
		boss = (Manager) staff_1; // ClassCastException
	}

}
