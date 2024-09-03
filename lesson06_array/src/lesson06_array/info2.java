package lesson06_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class info2 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 3, 8, 4};
		arr = new int[10];
		arr = new int[]{1, 2, 3};
		
		char[] cArr = {'A', 'B', '가', '나'};
		
		System.out.println(arr);
		System.out.println(cArr);
		
		// 배열 내부의 값을 간편하게 확인하는 함수
		System.out.println(Arrays.toString(arr));
	}
}
