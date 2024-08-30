package lesson04_operator;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 > ");
		String name = scanner.nextLine();
		System.out.println("국어점수를 입력하세요 > ");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요 > ");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요 > ");
		int mat = scanner.nextInt();
		
		// 총점
		int total = kor + eng + mat;
		// 평균(소수점 둘째자리로 반올림)
		double avg = (int)(total / 3d * 100 + 0.5) / 100d;
		
		System.out.println("==================================");
		System.out.println("이름  국어  영어  수학  총점  평균");
		System.out.println("==================================");
		System.out.printf("%4s %4d %4d %4d %4d %4f", name, kor, eng, mat, total, avg);
	}
}
