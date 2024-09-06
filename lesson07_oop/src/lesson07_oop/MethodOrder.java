package lesson07_oop;

public class MethodOrder {
	public static void main(String[] args) {
		MethodEx ex = new MethodEx();
		System.out.println("start");
		ex.one();
		System.out.println("end");
	}
}
class MethodEx{
	void one() {
		System.out.println("one start");
		two();
		System.out.println("one end");
	}
	void two() {
		System.out.println("two start");
		three();
		System.out.println("two end");
	}
	void three() {
		System.out.println("three start");
		System.out.println("three end");
	}
}