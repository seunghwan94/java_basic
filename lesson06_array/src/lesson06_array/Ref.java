package lesson06_array;

import java.util.Arrays;

public class Ref {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int[] arr2 = arr;
		
		
		arr[0] = 10;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		int a = 10;
		int b = a;
		
		a = 20;
		
		System.out.println(b);
	}
}
