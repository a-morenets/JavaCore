package _16_generics._01_generic;

class Gen<T> {
	T ob;

	public Gen(T o) {
		this.ob = o;
	}

	public T getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of ob: " + ob.getClass().getName());
	}
	
}

public class GenDemo {
	
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<>(88);
		iOb.showType();
		int v = iOb.getOb(); // no typecast needed
		System.out.println("v = " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<>("Non generic test");
		strOb.showType();
		String str = strOb.getOb(); // no typecast needed
		System.out.println("str = " + str);
		System.out.println();
		
//		iOb = strOb; // does NOT compile
		v = (int) iOb.getOb();
	}
	
}