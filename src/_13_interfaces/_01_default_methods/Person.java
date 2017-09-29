package _13_interfaces._01_default_methods;

public interface Person {
	
	default String getName() {
		return getClass().getName() + "_" + hashCode();
	}
	
}
