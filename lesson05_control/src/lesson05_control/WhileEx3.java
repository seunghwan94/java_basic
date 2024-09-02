package lesson05_control;

public class WhileEx3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			System.out.print("[" + i + "]");
			for (int j = 0; j <= 9; j++) {	
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
			
		}
		
	}
}
