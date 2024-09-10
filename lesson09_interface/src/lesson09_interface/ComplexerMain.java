package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println(com.INK);
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);
		System.out.println(com.FAX_NUMVER);
		System.out.println(Complexer.FAX_NUMVER);
		System.out.println(Fax.FAX_NUMVER);
		com.print();
		com.scan();
		com.send("02-8756-6482");
		com.receive("02-8756-6482");
		
		
//		Fax fax = com;
//		Fax fax1 = new Fax();
		
		Complexer com2 = new Complexer() {
			public void scan() {
				System.out.println("com2의 스캔");
			}
		};
		com2.print();
		
		
	}
}
