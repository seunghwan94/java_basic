package marble.area;

public class NonSaleLocal extends Local{
//	시작,보너스게임,포춘카드,무인도,올림픽,세계여행,국세청
	int type;
	
	public NonSaleLocal(int type, String name, int idx) {
		super(name,idx);
		this.type = type;
	}
}
