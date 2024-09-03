package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		// 오름차순
		int[] arr = {4,3,1,2,6,5};
		int[] rlt = new int[arr.length];
		rlt[0] = arr[0]; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				System.out.print("("+i+","+j+","+arr[i]+","+arr[j]+ ")");
				
			}
			System.out.println();
		}
//		System.out.println(Arrays.toString(rlt));
        
		
		
	}

}
