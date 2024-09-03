package lesson06_array;

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		// 내부값 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
				
		System.out.println(Arrays.toString(arr));
		
		// 교환
		for (int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = tmp;
		}
		
		
		System.out.println(Arrays.toString(arr));	
	}
}
