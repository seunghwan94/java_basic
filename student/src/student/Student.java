package student;

public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	char is_set;
	
	// 생성자 정리
	public Student(int no, String name, int kor, int eng, int mat, char is_set) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.is_set = is_set;
	}

	void modifyName(String name) {
		this.name = name;
	}
	
	void modifyScore(String subject, int socre ) {
		if (subject.equals("국어")) {
			this.kor = socre;
		}else if (subject.equals("영어")) {
			this.eng = socre;
		}else if (subject.equals("수학")) {
			this.mat = socre;
		}
	}
	// 총점, 평균 구하는 메서드
	int total() {
		return kor + eng + mat;
	}
	double avg() {
		return total() / 3d;
	}

	void remove(){
		this.is_set = 'N';
	}

	
	
	
	
}
