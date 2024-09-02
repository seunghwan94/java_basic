package lesson05_control;

public class ifEx2 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101);
		String grade = "";
		
		System.out.println("학점 여부 시작");
		if (score > 90) {
			grade = "A";
		}else if (score > 80) {
			grade = "B";
		}else if (score > 70) {
			grade = "C";
		}else if (score > 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		if(score >= 60 && score % 10 >= 5 || score == 100) {
			grade += "+";
		}
		
		System.out.println(score);
		System.out.println(grade);
		
	}
}
