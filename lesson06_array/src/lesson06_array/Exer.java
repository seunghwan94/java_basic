package lesson06_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한번 더 굴린다. 총 이동 걸리 출력
//		exer1(scan);
		// 2. 두 수를 입력 받아(정수) 두 숫자 사이의 정수 합 
		// ex. 3,7 or 7,3 = 3 + 4 + 5 + 6 + 7;
//		exer2(scan);
		// 3. 자연수 두개 입력, 두 수의 최대 공약수, 최소 공배수 구하기
		// ex. 12 18 >> 6
		
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		
		// 10 : 1,2,5,10
		// 9 : 1,3,9
		
		// 두 수의 공약수 : 1,2,3,6
		exer3(scan);
		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex. 10 소수가 아닙니다.
//		exer4(scan);
		// 5. 회문수 구하기 
		// 123321 : 회문수 입니다.
		// 12345 : 회문수가 아닙니다.
//		exer5(scan);
		scan.close();
		
		
	}
	public static void exer1(Scanner scan) {
		int sum = 0;
		
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			sum += dice1 + dice2;
			
			System.out.println(dice1 + " + " + dice2 + " = " + sum);
			
			if(dice1 != dice2) {
				break;
			}
			
		}
		System.out.println("합 : " + sum);
	}
	public static void exer2(Scanner scan) {
		System.out.println("두수를 입력하세요.");
		int num1 = Integer.parseInt(scan.nextLine()); //1
		int num2 = Integer.parseInt(scan.nextLine()); //3
		int max = 0;
		int min = 0;
		int sum = 0;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	public static void exer3(Scanner scan) {

//		int num1 = Integer.parseInt(scan.nextLine());
//		int num2 = Integer.parseInt(scan.nextLine());
		int num1 = 18;
		int num2 = 24;
		int maxrlt = 0;
		int min = 0;
		
		if (num1 > num2) {
			min = num2;
		}else {
			min = num1;
		}
		System.out.println("("+num1+", "+num2+")");
		for (int i = min; i > 0; i--) {
			if(num1 % i == 0 && num2 % i == 0 ) {
				maxrlt = i;
				System.out.println("최대공약수 : " + i);
				break;
			}
		}
//		최소공배수
//		12: 12, 24, 36, 48, 60, 72, 	... {1,2,3,4,6,12}
//		10: 10, 20, 30, 40, 50, 60, 70, ... {1,2,5,10}
//		14: 14, 28, 42, 56, 70, 		... {1,2,7,14}
//		15: 15, 30, 45, 60, 75, 		... {1,3,5,15}
		System.out.println("최소공배수 : " + num1 * num2 / maxrlt); 
		
	
	}
	public static void exer4(Scanner scan) {	
		System.out.println("자연수를 입력하세요. ");
		int num = scan.nextInt();
		boolean ckeck = true;
		
		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				ckeck = false;
				break;
			}
		}
		if (ckeck) {			
			System.out.println(num + "는 소수입니다.");
		}else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		
	}
	public static void exer5(Scanner scan) {
		// 5. 회문수 구하기 
		// 123321 : 회문수 입니다.
		// 12345 : 회문수가 아닙니다.
//		System.out.println("숫자를 입력하세요.");
//		String str = scan.nextLine();
		int num = 12321;
		int numTmp = num;
		
		int rlt = 0;
		
		while(numTmp != 0) {
			
			rlt = numTmp % 10 + rlt * 10 ;
			numTmp /= 10;
			
		}
		if(rlt == num) {
			System.out.println("회문수이다.");	
		}else {
			System.out.println("회문수아니다.");
		}
		
	}
}
