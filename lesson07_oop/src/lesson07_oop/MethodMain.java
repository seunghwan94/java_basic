package lesson07_oop;

import java.util.Arrays;

public class MethodMain {
	public static void main(String[] args) {
		// 실행문
		Param p = new Param();
		// 인스턴스 메서드 호출 (10,20) => argument
		int a = p.add(10, 20);
		// 클래스 메서드 호출
		int b = Param.add2(0, 0);
		
		int c = Param.max(new int[] {1,2,3});
		
		int d = Param.min(1,2,3,4,5);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Param{
	// (int a, int b) => parameter
		int add(int a, int b) {
			return a + b; // ∴ int
		}
		
		static int add2(int a, int b) {
			return a + b;
		}
		
		static int max(int[] arr) {
			if (arr == null || arr.length == 0){
				return -1;
			}
			
			int rlt = arr[0];
			
			for (int i : arr){
				if ( i > rlt){
					rlt = i;
				}
			}
			return rlt;
		}	
		
		static int min(int... arr) {
			if (arr == null || arr.length == 0){
				return -1;
			}
			
			int rlt = arr[0];
			
			for (int i : arr){
				if ( i < rlt){
					rlt = i;
				}
			}
			return rlt;

		}
}