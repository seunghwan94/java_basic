package marble.area;

public abstract class SaleLocal extends Local{
	int colorIdx;

	public SaleLocal(int colorIdx, String name, int idx) {
		super(name, idx);
		this.colorIdx = colorIdx;
	}
}
