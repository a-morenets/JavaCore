package _13_interfaces._01_default_methods;

public interface Named {
	
	default String getName() {
		return getClass().getName() + "_" + hashCode();
	}
	
}
