package lesson06_array;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 입금, 출금, 잔고, 종료
		String[] menu = {"1.입금", "2.출금", "3.잔고", "4.종료"};
		int balance = 0;
		
		target:
		while (true) {
			System.out.println("=====================================");
			for (String i : menu) {
				System.out.print(i + " ");
			}
			System.out.println("\n=====================================");
			int input = Integer.parseInt(scan.nextLine());
			
			if(0 < input && input <= 4) {				
				System.out.println(menu[input-1]);
				switch(input){
				case 1:
					System.out.println("입금할 금액 입력 > ");
					int in = Integer.parseInt(scan.nextLine());
					balance += in;
					break;
				case 2:
					if(balance > 0) {						
						System.out.println("출금할 금액 입력 > ");
						int out = Integer.parseInt(scan.nextLine());
						if(balance >= out) {							
							balance -= out;
						}else {
							System.out.println("잔고가 부족합니다.");
						}
					}else {
						System.out.println("잔액이 없습니다.");
					}
					break;
					
				case 3:
					System.out.println("잔액 조회 > " + balance);
					break;
				case 4:
					System.out.println("종료");
					break target;
				}
						
			} else {
				System.out.println("1~4까지만 할것");
			}
		}
		
	}
}
