package Assignment;

import java.util.Arrays;

public class InsertSort {
	// 작은 인덱스에서부터 시작 (회차)
	// 현재 위치의 인덱스 미만의 값들과 대소 비교
	// 	- 조건 검수 후 해당위치에 삽입 예정
	//	- 해당 위치에서 부터 한칸씩 우측 이동
	// 	- 예정 위치에 해당 값 대입
	public static void main(String[] args) {
//		
		int[] list = {6,5,3,1,8,7,2,4};
		int tmp;
		
		System.out.println(Arrays.toString(list));
		System.out.println("========================");

		
		for (int i = 0; i < list.length-1; i++) {
			
			for (int j = i + 1; j > 0; j--) {
//				System.out.println(j+", "+(j-1));
				if(list[j] < list[j-1]) {
					tmp = list[j];
					list[j] = list[j-1];
					list[j-1] = tmp;
				}
//				else {
//					System.out.println(Arrays.toString(list));
//					break;
//				}

				System.out.println(Arrays.toString(list));	
			}			
			System.out.println();
		}
		System.out.println("========================");		
		System.out.println(Arrays.toString(list));

//		int[] list = {6,5,3,1,8,7,2,4};
//		int tmp;
//		
//		System.out.println(Arrays.toString(list));
//		System.out.println("========================");
//	
//		
//		for (int i = 0; i < list.length-1; i++) {
//			
//			for (int j = 0; j < i + 1; j++) {
////				System.out.println(j+", "+(j+1));
//				
//				if(list[j] > list[j+1]) {
//					tmp = list[j];
//					list[j] = list[j+1];
//					list[j+1] = tmp;
//				}
//				
//	
//				System.out.println(Arrays.toString(list));	
//			}			
//			System.out.println();
//		}
//		System.out.println("========================");		
//		System.out.println(Arrays.toString(list));
	}
}
