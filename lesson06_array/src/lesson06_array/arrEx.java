package lesson06_array;

import java.util.Arrays;

public class arrEx {
	public static void main(String[] args) {
		System.out.println("첫번째 : " + args[0]);
		System.out.println("두번째 : " + args[1]);
		
		// 객체 : object 변수 (기본타입 이 아닌 경우)
		// ex. String str = "asdf";
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		arr = arr2;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
}
