package day2;

import java.util.Arrays;

public class info {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		matrix[0][0] =1;
		matrix[0][1] =2;
		matrix[1][1] =5;
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));
		
		
		
		for(int[] arr : matrix) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));

		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
