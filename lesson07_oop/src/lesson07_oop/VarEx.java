package lesson07_oop;

public class VarEx {
	public static void main(String[] args) {
		Avante abAvante1 = new Avante();
		Avante abAvante2 = new Avante();
		
		abAvante1.color = "검정";
		abAvante2.color = "흰색";
		
		
		System.out.println(abAvante1.color);
		System.out.println(abAvante2.color);
		
		abAvante1.company = "기아";
		
		
		System.out.println(Avante.company);
		System.out.println(abAvante1.company);
		System.out.println(abAvante2.company);
		
	}
}
class Avante {
	String color;
//	String company = "현대";
	static String company = "현대";

}