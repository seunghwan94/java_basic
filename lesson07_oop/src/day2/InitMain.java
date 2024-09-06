package day2;

import java.util.Arrays;

public class InitMain {
	
	int num = 10;
	int[] arr = new int[10];
	static int[] arr2 = new int[10];
	
	public InitMain() {
		System.out.println("생성자");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	{
		System.out.println("초기화 블럭");
		for (int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static {
		System.out.println("클래스 초기화 블럭");
		for (int i = 0; i< arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 100);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("===================");
		InitMain initMain = new InitMain();		
		System.out.println("===================");
		InitMain initMain2 = new InitMain();
		System.out.println("===================");
//		InitMain;
		
		
		System.out.println("main end");
	}
}
