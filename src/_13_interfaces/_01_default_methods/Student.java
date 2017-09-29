package _13_interfaces._01_default_methods;

public class Student implements Person, Named {

	// conflict resolution with getName():
	@Override
	public String getName() {
		return Person.super.getName();
	}

}
