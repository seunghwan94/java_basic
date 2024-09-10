package lesson09_interface;

public class Complexer implements Printer, Scanner, Fax{

	@Override
	public void send(String msg) {
		System.out.println(FAX_NUMVER + "에서 " + msg + "로 Fax 송신" );
		
	}

	@Override
	public void receive(String msg) {
		System.out.println(FAX_NUMVER + "에서 " + msg + "로 Fax 수신" );
		
	}

	@Override
	public void scan() {
		System.out.println("스캔 실행");
		
	}

	@Override
	public void print() {
		System.out.println("출력 실행");
		
	}
	
}
