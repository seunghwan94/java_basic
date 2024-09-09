package marble;

public class Player {
	String name; // 이름
	int money = 2_000_000; // 자산
	int  idx; // 위치
	
	
	public Player(String name) {
		this.name = name;		
	}
	
	public String toString() {
		return name + "이 " + idx + "번째 위치에 존재합니다. 자산은 " + money + "입니다.";
	}
	
	
	
}
