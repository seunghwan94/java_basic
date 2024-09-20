package lesson14_generic;

public class GenericEx {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setItem(10);
		
		int result = (Integer)box.getItem();
		System.out.println(result);
	}
}


class Box<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}