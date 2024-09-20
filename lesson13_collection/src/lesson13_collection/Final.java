package lesson13_collection;

import java.util.*;

public class Final {
	public static void main(String[] args) {
		//Arrays, Collections, Objects
		
//		// 오류 (배열을 리스트로 복사해서 오류)
//		List<Integer> list = Arrays.asList(1,2,3,5);
//		list.add(5);
//		System.out.println(list);
//		// 대체 (배열을 리스트로 복제하면 된다.)
//		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,5));
//		list2.add(5);
//		System.out.println(list2);
//		
//		
//		// 배열 -> List (int -> Integer 기본타입으로는 사용 불가)
//		// 오류 
//		int[] arr = {1,2,3,5};
//		list = Arrays.asList(arr);
//		// 대체
//		Integer[] arr1 = {1,2,3,5};
//		list2 = Arrays.asList(arr1);
//		
//		// List -> 배열 
//		list2.toArray(arr1);
//		System.out.println(Arrays.toString(arr1));
//		
//		// Collections Method
//		Collections.shuffle(list2);
//		System.out.println(list2);
//		// List는 comparable 무조건 만들어야 되는데 그냥 된다
//		// 올림 차순
//		Collections.sort(list2); 
//		// 내림 차순
//		Collections.sort(list2, Collections.reverseOrder()); 
//		System.out.println(list2);
//		
		
	}
}
