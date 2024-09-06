package Assignment;

import java.util.Arrays;

public class BubleSort {
	public static void main(int[] arr) {
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
}
