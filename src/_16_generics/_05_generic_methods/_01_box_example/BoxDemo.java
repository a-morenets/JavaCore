package _16_generics._05_generic_methods._01_box_example;

public class BoxDemo {
	
	public static Number sum(Box<? extends Number> arg1, Box<? extends Number> arg2) {
		return arg1.getItem().doubleValue() + arg2.getItem().doubleValue();
	}

	public static <T1 extends Number, T2 extends Number> Number mult(Box<T1> arg1, Box<T2> arg2) {
		return arg1.getItem().doubleValue() * arg2.getItem().doubleValue();
	}
	
	public static Number div12(BoxExtNumber<?> arg1, BoxExtNumber<?> arg2) {
		return arg1.getItem().doubleValue() / arg2.getItem().doubleValue();
	}
	
	public static <T1 extends Number, T2 extends Number> Number div21(BoxExtNumber<T1> arg1, BoxExtNumber<T2> arg2) {
		return arg2.getItem().doubleValue() / arg1.getItem().doubleValue();
	}
	
	public static void main(String[] args) {
		Double d = 123456789.987654321;
		Float f = 1.23f;
		Short s = 2;
		
		// we can create Box of ANY type
		Box<Double> boxDouble = new Box<>(d);
		Box<Short> boxShort = new Box<>(s);
		BoxExtNumber<Float> boxExtFloat = new BoxExtNumber<>(f);
		BoxExtNumber<Integer> boxExtInteger = new BoxExtNumber<>(10);
		
		System.out.println("sum(b1, b2) = " + sum(boxDouble, boxShort));
		System.out.println("mult(b1, b2) = " + mult(boxDouble, boxShort));
		System.out.println("bExt1 / bExt2 = " + div12(boxExtFloat, boxExtInteger));
		System.out.println("bExt2 / bExt1 = " + div21(boxExtFloat, boxExtInteger));
	}

}
