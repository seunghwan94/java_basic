package shape;

public class Square extends Shape implements Shape2D{
	private int x;
	private int y;
	
	public Square(String name) {
		super(name);
	}


	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	@Override
	public double length() {
		
		return 2 * (x + y);
	}

	@Override
	public double area() {
		return x * y;
	}
	@Override
	public String toString() {
		return super.toString() + " [(x=" + x + ",y=" + y + "), 둘레=" + length() + ", 넓이=" + area() + "]";
	}
}
