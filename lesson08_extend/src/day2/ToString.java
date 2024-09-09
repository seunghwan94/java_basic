package day2;

public class ToString {
	
	public String toString() {
		return "재정의";
	}
	public void print() {
		System.out.println(super.toString());
	}
	
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());
		
		ToString ts = new ToString();
		System.out.println(ts);
		System.out.println(ts.toString());
		ts.print();
		
		
	}
}
