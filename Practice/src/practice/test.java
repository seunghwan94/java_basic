package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		test1();

	}
	public static void test() {
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
//				System.out.println(Arrays.toString(rlt));
	}
	public static void test1() {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		
		String answer = "";

		
		char tmp1 = my_string.charAt(num1);
		char tmp2 = my_string.charAt(num2);
		
		for (int i = 0; i < my_string.length(); i++) {
			if(i == num1) answer += tmp2;
			else if(i == num2) answer += tmp1;
			else answer += my_string.charAt(i);
		}
		
		System.out.println(answer);
		
//        my_string[num2]; = answer;

		
		
		
		
	}
	
	

}
