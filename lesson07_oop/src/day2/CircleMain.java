package day2;

public class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		
		circle.print();
		circle.printArea();
		circle.printRound();
		circle.setR(6).printArea().printRound();
	}
}
