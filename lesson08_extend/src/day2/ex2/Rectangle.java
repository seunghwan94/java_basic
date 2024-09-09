package day2.ex2;

public class Rectangle extends Shape{
	int width, height;

	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", type=" + type + "]";
	}
	
	
	
	
}
