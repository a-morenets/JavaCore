package _16_generics._00_non_generic;

class NonGen {
	Object ob;

	public NonGen(Object ob) {
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of ob: " + ob.getClass().getName());
	}
	
}

public class NonGenDemo {
	
	public static void main(String[] args) {
		NonGen iOb = new NonGen(5);
		iOb.showType();
		int v = (Integer) iOb.getOb(); // typecast needed
		System.out.println("v = " + v);
		System.out.println();
		
		NonGen strOb = new NonGen("generic test");
		strOb.showType();
		String str = (String) strOb.getOb(); // typecast needed
		System.out.println("str = " + str);
		System.out.println();
		
		iOb = strOb;
		v = (int) iOb.getOb(); // compiles but not correct (ClassCastException)
	}
	
}