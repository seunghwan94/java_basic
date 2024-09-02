package lesson05_control;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		// 가위 바위 보
		// 가위 : 1
		// 바위 : 2
		// 보 : 3
		while (true) {			
			Scanner scanner = new Scanner(System.in);
			System.out.println("가위(1), 바위(2), 보(3) 중 선택하세요");
		//	int test = scanner.nextInt();
			int me = Integer.parseInt(scanner.nextLine());
			int you = (int)(Math.random() * 3);
			
			System.out.println(you);
			
			switch(me - you){
				case -2, 1:
					System.out.println("이김");
					break;
				case 0:
					System.out.println("비김");
					break;
				default:
					System.out.println("졌다");
					break;
			}
			
			System.out.println("더 할꺼야? (yes/no)");
			String check = scanner.nextLine();
			System.out.println(check);
			
			if(check.equals("no")) {
				scanner.close();
				break;
			}
			
		}
		
	}
}
