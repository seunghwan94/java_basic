package lesson06_array;

public class arrEx1 {
	public static void main(String[] args) {
		int[] arr = {4,10,20,7,3};
		// 해당 배열에서 최대값을 구해서 출력
		int max = arr[0];
		int min = arr[0];
		for (int i : arr) {
			if (max < i) {
				max = i;
			}else if (min > i) {
				min = i;
			}
		}
		System.out.println(max);
		System.out.println(min);

		// 배열 요소의 합계 / 평균 구하기
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		double avg = (double)sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}
}
