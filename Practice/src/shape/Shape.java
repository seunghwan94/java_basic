package shape;

public abstract class Shape {
	private String type;
	
	 Shape(String type){
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}


}
