package lesson09_interface_ex;

public class StarcraftMain {
	public static void main(String[] args) {
		Scv scv = new Scv();
		Marine marine = new Marine();
		scv.repair(marine);
		
		
//		
		Tank tank = new Tank();
		tank.toggleSiege();
		scv.repair(tank);
		
		Repairable r = new Wraith();
		Repairable r2 = new Scv();
		
		Unit[] units = new Unit[12];
		

		
	}

}
