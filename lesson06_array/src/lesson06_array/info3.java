package lesson06_array;

import java.util.Arrays;

public class info3 {
	public static void main(String[] args) {
//		int[] lotto = new int[6];
//		int idx = 0;
//		
//		// 1. 로또 첫번째 방식
//		while (true) {
//			int number = (int)(Math.random() * 45) + 1;
//			
//			boolean insert = true;
//			
//			for (int i = 0; i <= idx; i++) {
//				if (lotto[i] == number) {
//					insert = false;
//					break;
//				}
//				
//			}
//			if (insert == true) {
//				lotto[idx] = number;
//				idx++;
//			}
//			
//			if (idx == 6) break;
//		}
//		
//		System.out.println(Arrays.toString(lotto));
//		// 2. 로또 두번째 방식	
//		while (true) {
//			int number = (int)(Math.random() * 45) + 1;
//			
//			for (int i: lotto) {
//				if (i == number) {
//					continue;
//				}
//			}
//			lotto[idx] = number;
//			idx++;
//			if (idx == 6) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
//		
//		
//		// 3. 로또 세번째 방식		
//		while (true) {
//			
//			int number = (int)(Math.random() * 45) + 1;
//			
//			for (int i: lotto) {
//				if (i == number) {
//					continue;
//				}
//			}
//			
//			lotto[idx] = number;
//			idx++;
//			
//			if (idx == 6) break;
//			
//		}
//		System.out.println(Arrays.toString(lotto));
		
		
		int[] arr = new int[45];
		
		// 내부값 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		// 교환
		for (int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = tmp;
		}
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = arr[i];
		}
		System.out.println(Arrays.toString(lotto));
	}
}
