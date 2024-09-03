package lesson05_control;

public class ForEx4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// 1. A * B = C
//				System.out.println(i + " * " + j + " = " + i * j);
				
				// 2. B가 5 였을때 건너뛰고 출력
//				if (j == 5) break;
//				System.out.println(i + " * " + j + " = " + i * j);
				
				// 3. A가 5였을때 건너뛰고 출력
				if (i == 5) break;
				System.out.println(i + " * " + j + " = " + i * j);
			
			}
		}
		
		// 내부에서 외부 break 할때
		point:
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i == 5) break point;
					System.out.println(i + " * " + j + " = " + i * j);
				
				}
			}
	}
}
