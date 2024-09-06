package student;

public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	// 생성자 정리
	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 총점, 평균 구하는 메서드
	
	int total() {
		return kor + eng + mat;
	}
	
	double avg() {
		return total() / 3d;
	}
	
	
	
	
}
