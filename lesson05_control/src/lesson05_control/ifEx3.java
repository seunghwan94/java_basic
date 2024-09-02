package lesson05_control;

public class ifEx3 {
	public static void main(String[] args) {
		// 자격증 시험, 과락
		// 3 과목  
		// 평균 60 이상이면 합격
		// 개별 과목이 40 미만이면 불합격
		int score1 = (int)(Math.random() * 101);
		int score2 = (int)(Math.random() * 101);
		int score3 = (int)(Math.random() * 101);
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		if ((score1 >= 40 && score2 >= 40 && score3 >= 40) && (score1+score2+score3 / 3) > 60 ) {
			System.out.printf("평균 : %d\n", (score1+score2+score3) / 3);
			System.out.println("합격");
		}else {
			System.out.printf("평균 : %d\n", (score1+score2+score3) / 3);
			System.out.println("불합격");
		}
			
	
		
		
	}
}

