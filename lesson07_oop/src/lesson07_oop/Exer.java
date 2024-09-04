package lesson07_oop;

import java.util.Arrays;
import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		int[] arr = {7,10,5,2,1};
//		bubleArray(arr);	// 버블 정렬
		
		// 1. 지폐, 동전 세기 
//		prac1(); // 
		
		// 2. Scanner 사용하여 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람이름들을 문자열 배열 만들어서
		// 프로그램 종료 직전 확인
		prac2();
		
	}

	public static void bubleArray(int[] arr) {
		// 초기
		System.out.println(Arrays.toString(arr));
		
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			// 중간
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void prac1() {
		// 초기
		int money = 123456;
		int tmp = money;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] counts = new int[10];
		
		for (int i = 0; i < units.length; i++) {
			counts[i] = tmp / units[i];
			tmp %= units[i];
		}
		for (int i = 0; i < units.length; i++) {
			System.out.println(units[i] + " : " + counts[i]);
		}
		
	}
	public static void prac2() {
		Scanner scan = new Scanner(System.in);
		
		String[] list = new String[2];
		String[] tmp = {};
		
		int cnt = 0;
		
		target:
		while (true) {
			
			System.out.println("이름을 입력해라.(종료:q)");
			String name = scan.nextLine();
			
			if (name.equals("q")) {
				for (int i = 0; i < list.length; i++) {
					if(list[i]==null) {
						break target;	
					}
					System.out.print(list[i] + "  ");
				}
//				System.out.println(Arrays.toString(list));
//				break;
			}
			
			cnt++;
			if (cnt > list.length) {
				list = new String[list.length * 2];	
			}
			
			
			for (int i = 0; i < cnt; i++) {
				if(i==cnt-1) {
					list[i] = name;					
				} else {
					list[i] = tmp[i];
				}
			}  
			tmp = list;
		}
			
	}
	public static void myBubleArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp;
					
					
					
				}
			}
		}
		
		
	}
}
