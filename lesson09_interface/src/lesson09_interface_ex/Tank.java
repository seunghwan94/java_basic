package lesson09_interface_ex;

public class Tank extends GroundUnit implements Repairable{
	boolean siege;
	void toggleSiege() {
//		 애니메이션 동작 재생
		siege = !siege;
	}
}
