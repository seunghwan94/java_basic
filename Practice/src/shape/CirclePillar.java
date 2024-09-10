package shape;

public class CirclePillar extends Shape implements Shape3D{
	
	private Circle circle;
	private int h;
	
	public CirclePillar(String name) {
		super(name);
		circle = new Circle(null);
	}

	@Override
	public double length() {
		return circle.length();
	}

	@Override
	public double area() {
		return length() * h + circle.area();
	}

	@Override
	public double volume() {
		return circle.area() * h;
	}
	
	public void setData(int r, int h) {
		circle.setR(r);
		this.h = h;
	}

	@Override
	public String toString() {
		return super.toString() + " [(r=" + circle.getR() + ",h=" + h + ")"
								+ ", 부피=" + volume() 
							    + ", 넓이=" + area() + "]";
	}


	
}
