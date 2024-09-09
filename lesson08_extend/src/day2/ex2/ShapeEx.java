package day2.ex2;

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		
		for (Shape i : shapes) {
			System.out.println(i);
			System.out.println("넓이 : "+ i.area() +", 길이 : "+ i.length());
		}
		
	}
	
}
abstract class Shape{
	String type;
	Shape(String type){
		this.type = type;
		
	}
	
	abstract double area();
	abstract double length();
}

class Circle extends Shape{
	int r;

	public Circle(int r) {
		super("원");
		this.r = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]";
	}




	
	
}