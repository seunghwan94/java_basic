package shape_teacher;

public class Cylinder extends Shape implements D3{
	private Circle circle;
	private int z;
	
	
	
	public Cylinder(int r, int z) {
		super("원기둥");
		circle = new Circle(r);
		this.z = z;
	}
	
	public Cylinder(Circle circle, int z) {
		super("원기둥");
		this.circle = circle;
		this.z = z;
	}

	@Override
	public double volume() {
		return circle.area() * z;
	}

	@Override
	public double area() {
		return circle.area() * 2 + circle.length() * z;
	}
	
}
