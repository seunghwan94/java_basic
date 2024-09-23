package student_my_1;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private char is_set;
	
	public Student() {}
	
	
	// 생성자 정리
	public Student(int no, String name, int kor, int eng, int mat, char is_set) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.is_set = is_set;
	}

	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void modifyName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public char getIs_set() {
		return is_set;
	}


	public void setIs_set(char is_set) {
		this.is_set = is_set;
	}


	public void modifyScore(String subject, int socre ) {
		if (subject.equals("국어")) {
			this.kor = socre;
		}else if (subject.equals("영어")) {
			this.eng = socre;
		}else if (subject.equals("수학")) {
			this.mat = socre;
		}
	}
	
	public String toString() {
		return String.format("%2d %5s %5d %5d %5d %5d %5.2f \n", no,name,kor,eng,mat,total(),avg());
	}
	
	
	// 총점, 평균 구하는 메서드
	public int total() {
		return kor + eng + mat;
	}
	public double avg() {
		return total() / 3d;
	}

	public void remove(){
		this.is_set = 'N';
	}

	
	
	
	
}
