package lesson06_array;

public class enhanced {
	public static void main(String[] args) {
		int[] arr = {10,15,5,20,30};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 향상된 for 문
		// 1. 인덱스 X
		// 2. 읽기 전용
		// for (타입 변수 : 배열){
		//	
		// }
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		String[] strs = {"더조은", "아카데미", "자바", "데이터베이스"};
		for (String i : strs) {
			System.out.print(i + " ");
		}
	}
}
