package marble.area;

public abstract class Local {
	String name;
	int idx;
	
	public Local() {}

	public Local(String name, int idx) {
		this.name = name;
		this.idx = idx;
	}

	@Override
	public String toString() {
		return "["+name+"]";
	}
	
}
