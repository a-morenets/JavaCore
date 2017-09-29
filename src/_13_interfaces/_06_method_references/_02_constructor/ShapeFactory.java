package _13_interfaces._06_method_references._02_constructor;

import java.util.function.Supplier;

public class ShapeFactory {

//	static Shape createShape(ShapeBuilderInterface sbi) {
//		return sbi.build();
//	}
	// or using default Supplier
	static Shape createShape(Supplier<Shape> supplier) {
		return supplier.get();
	}
	
}
