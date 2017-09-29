package _13_interfaces._06_method_references._01_instance_method_with_object_ref;

interface MyFunc<T> {
	boolean func(T v1, T v2);
}

class HighTemp {
	private int hTemp;

	public HighTemp(int hTemp) {
		this.hTemp = hTemp;
	}

	boolean sameTemp(HighTemp t2) {
		return hTemp == t2.hTemp;
	}

	boolean lessThanTemp(HighTemp t2) {
		return hTemp < t2.hTemp;
	}
}

public class InstanceMethodWithObjectRefDemo {

	static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int count;
		HighTemp[] weekDaysHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
									 new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83) };
		
		count = counter(weekDaysHighs, HighTemp::sameTemp, new HighTemp(90));
		System.out.println("Days with temp = 90: " + count);

		count = counter(weekDaysHighs, HighTemp::lessThanTemp, new HighTemp(90));
		System.out.println("Days with temp < 90: " + count);
	}

}
