package lesson05_control;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int sum = 0;
		boolean flag =true;
		while (flag) {
			System.out.println("더할 숫자 값 입력");
			String input = scan.nextLine();
			int num = Integer.parseInt(input);
			sum += num;
			if (num == 0) {
				flag = false;
			}
		}
		System.out.println("합계 : " + sum);
		scan.close();
		
	}
}
