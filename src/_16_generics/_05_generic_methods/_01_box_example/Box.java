package _16_generics._05_generic_methods._01_box_example;

public class Box<T> {
	private T item;

	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
