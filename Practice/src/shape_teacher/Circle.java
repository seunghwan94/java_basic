package shape_teacher;

public class Circle extends Shape implements D2{
	private final int r;

	public Circle(int r) {
		super("원");
		this.r = r;
	}

	
	@Override
	public double length() {
		return 2 * r * Math.PI;
	}

	@Override
	public double area() {
		return r * r * Math.PI;
	}
	
	
	
	
}
