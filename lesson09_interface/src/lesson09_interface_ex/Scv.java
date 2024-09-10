package lesson09_interface_ex;

public class Scv extends GroundUnit implements Repairable{
	void repair(Unit u) {
		if(!(u instanceof Repairable)) {
			System.out.println("수리 불가 대상");
			return;
		}
		
		// 수리 실행 로직
	}

}
