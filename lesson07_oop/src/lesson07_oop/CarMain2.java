package lesson07_oop;

public class CarMain2 {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		Car tico = new Car();
		
		tico.color = "흰색";
		tico.company = "대우";
		tico.type = "경차";
		
		for (int i = 0; i < cars.length; i++ ) {
			cars[i] = tico;
		}
		
		System.out.println(cars[2].color);
		
		cars[2].color = "검정";
		
		System.out.println(cars[2].color);
	}
}
