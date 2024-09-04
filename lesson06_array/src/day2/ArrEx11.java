package day2;

public class ArrEx11 {
	public static void main(String[] args) {
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				for (int k = 0; k <= 2; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}
		
		
		for (int[][] arr2: arrInt) {
			for (int[] arr1: arr2) {
				for (int num: arr1) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
