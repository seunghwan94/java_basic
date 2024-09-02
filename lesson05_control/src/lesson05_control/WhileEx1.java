package lesson05_control;

public class WhileEx1 {
	public static void main(String[] args) {
		// 정수를 입력 받아 각 자릿수의 합계를 구하여라.
		int num = 123123;
		int sum = 0;
		
		for ( ;num != 0; ) {
			sum += num % 10;
			num /= 10;
		}
		
//		while (num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
		 
		System.out.println(sum);
		
		
	}
}
