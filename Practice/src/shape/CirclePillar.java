package shape;

public class CirclePillar extends Shape implements Shape3D{
	
	private Circle circle;
	private int h;
	
	public CirclePillar(String name) {
		super(name);
		circle = new Circle(null);
	}
	
	public void setData(int r, int h) {
		circle.setR(r);
		this.h = h;
	}
	
	@Override
	public double area() {
		return circle.length() * h + circle.area();
	}

	@Override
	public double volume() {
		return circle.area() * h;
	}

	@Override
	public String toString() {
		return super.toString() + " [(r=" + circle.getR() + ",h=" + h + ")"
								+ ", 부피=" + volume() 
							    + ", 넓이=" + area() + "]";
	}


	
}
