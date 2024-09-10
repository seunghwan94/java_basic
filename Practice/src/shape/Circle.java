package shape;

public class Circle extends Shape implements Shape2D{

	private int r;
	
	public Circle(String name) {
		super(name);
	}

	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public double length() {
		return (int)((r * 2 * Math.PI)*100)/100d;
	}

	@Override
	public double area() {
		return (int)((r * r * Math.PI)*100)/100d;
	}

	@Override
	public String toString() {
		return super.toString() + "     [(r=" + r + "), 둘레=" + length() + ", 넓이=" + area() + "]";
	}


}
