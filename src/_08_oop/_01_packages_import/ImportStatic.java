package _08_oop._01_packages_import;

import _08_oop._00_classes.Employee;
import static java.lang.System.*;

public class ImportStatic {

	public static void main(String[] args) {
		
		/* Class Employee was imported from another package */
		Employee harry = new Employee("Harry Hacker", 50000);
		
		/* All System's static methods were imported above */
		out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
	}

}
