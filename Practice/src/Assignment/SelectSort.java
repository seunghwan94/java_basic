package Assignment;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] list = {8,5,2,6,9,3,1,4,0,7};
//		int[] list = {8,5,2,6,9,3};
		
		int min = 0;
		int tmp = 0;
		System.out.println(Arrays.toString(list));
		
		for (int i = 0; i < list.length; i++) {
			min=i;
			for (int j = i + 1; j < list.length; j++) {
				System.out.print("s");
				if(list[min] > list[j]) {
					min = j;
				}
				
			}
			
			tmp = list[min];
			list[min] = list[i];
			list[i] = tmp;
			System.out.println(Arrays.toString(list));
		}
		System.out.println();
		System.out.println(Arrays.toString(list));
	}
}
