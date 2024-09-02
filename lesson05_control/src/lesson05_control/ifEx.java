package lesson05_control;

public class ifEx {
	public static void main(String[] args) {
		
		double rand = Math.random();
		int score = (int)(rand * 101);
		
		System.out.println("시험 시작");
		System.out.println(rand);
		System.out.println(score);
		
		if (score >= 60) {
			System.out.println("합격");
		}else {			
			System.out.println("불합격");
		}
		System.out.println("시험 끝");
	}
}
