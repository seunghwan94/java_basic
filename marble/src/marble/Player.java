package marble;

import marble.area.SaleLocal;

public class Player {
	String name;
	int money = 2_000_000;
	int idx;
	SaleLocal[] own = new SaleLocal[32];
	int ownCnt;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + "이 " + idx +"번째 위치에 존재합니다. 자산은 " + money + "입니다";
	}
	
}
