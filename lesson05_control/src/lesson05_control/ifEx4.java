package lesson05_control;

public class ifEx4 {
	public static void main(String[] args) {
		// 계절 계산
		int month = 5;
		
		// 3,4,5 봄
		// 6,7,8 여름
		// 9,10,11 가을
		// 12,1,2 겨울
		
		if (3 <= month && month <= 5) {
			System.out.println("봄");
		} else if (6 <= month && month <= 8) {
			System.out.println("여름");
		} else if (9 <= month && month <= 11) {
			System.out.println("가을");
		} else if (12 == month && month <= 2) {
			System.out.println("겨울");
		}
		
	}
}
