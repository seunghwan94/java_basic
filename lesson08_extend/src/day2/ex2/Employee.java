package day2.ex2;

public abstract class Employee {
	String name;
	
	
	public Employee(String name) {
		this.name = name;
	}
	void startWork() {
		System.out.println("출근..");
	}
//	void work() {
//		System.out.println("업무--");
//	}
	
	abstract void work();
	
	void endWork() {
		System.out.println("퇴근!!");
	}
	
	public String toString() {
		return name;
	}
}
