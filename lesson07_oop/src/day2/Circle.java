package day2;

public class Circle {
	double r;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double r) {
		setR(r);
	}
	
	Circle setR(double r) {
		this.r = r;
		return this;
	}
	
	Circle printRound(){
		System.out.println(Math.PI * r * 2);
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	Circle print() {
		System.out.println(r);
		return this;
	}
	
}
