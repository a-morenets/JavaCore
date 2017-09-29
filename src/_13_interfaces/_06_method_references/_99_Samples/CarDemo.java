package _13_interfaces._06_method_references._99_Samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class CarDemo {

	public static class Car {
		
		public static Car create(final Supplier<Car> supplier) {
			return supplier.get();
		}
		
		public static void collide(Car car) {
			System.out.println("Collided " + car.toString());
		}
		
		public void follow(Car anotherCar) {
			System.out.println("Following the " + anotherCar.toString());
		}
		
		public void repair() {
			System.out.println("Repaired " + this.toString());
		}
		
	}
	
	public static void main(String[] args) {
		Car car = Car.create(Car::new); // constructor reference
		List<Car> cars = Arrays.asList(car);
		
		cars.forEach(Car::collide); // static method reference
		cars.forEach(Car::repair); // // instance method reference for each Car object
		
		Car police = Car.create(Car::new);
		cars.forEach(police::follow); // instance method reference for policeCar object only
	}

}
