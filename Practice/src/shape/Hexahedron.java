package shape;

public class Hexahedron extends Shape implements Shape3D{
	private Square square;
	private int h;
	
	public Hexahedron(String name) {
		super(name);
		square = new Square(null);
	}
	
	public void setData(int x,int y, int h) {
		square.setXY(x,y);
		this.h = h;
	}

	@Override
	public double area() {
		return square.area();
	}	
	
	@Override
	public double volume() {
		return area() * h;
	}
	@Override
	public double length() {
		return (square.area() + square.getY()*h + h*square.getX())*2;
	}

	@Override
	public String toString() {
		return "육면체 [(x=" + square.getX() + ",h=" + h + ",y=" + square.getY() +
				        ") 부피=" + volume() + ", 넓이=" + length() + "]";
	}


	
	
}
