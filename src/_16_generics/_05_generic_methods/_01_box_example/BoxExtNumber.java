package _16_generics._05_generic_methods._01_box_example;

public class BoxExtNumber<T extends Number> {
	private T item;

	public BoxExtNumber(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
