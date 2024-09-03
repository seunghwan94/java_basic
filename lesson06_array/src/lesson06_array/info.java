package lesson06_array;

public class info {
	public static void main(String[] args) {
		// 배열 : 하나의 변수로 여러 데이터를 저장
		// 타입[] 변수명; 타입 변수명[];
		
		int num;
		int[] arr = null;
		int[] arr1 = new int[5]; // 
		double[] arr2;
		String[] strings;
		
		String test = "";
		// 기본값 0 or false
		// String str = null;
		for (int i : arr1) {
			test += Integer.toString(i) + ", ";
		}
		
		System.out.println(test);
		
		
		// 배열 선언,
		// 길이를 통한 초기화
		// 값을 통한 초기화
		String[] strs = {"홍길동", "이순신", "김유신"};
		for (String i : strs) {
			test += i + ", ";
		}
		System.out.println(test);
	}
}
