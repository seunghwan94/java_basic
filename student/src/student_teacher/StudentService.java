package student_teacher;

import static student_teacher.StudentUtils.*;

import java.util.Arrays;

import student.StudentUtils;

// Logic
public class StudentService {
	private Student[] students = new Student[5];
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(4, "개똥이", 77, 66, 77);
	}
	// 학생 등록
	public void add() {
	
		int no = tryCatchInt("학번");
		String name = tryCatchStr("이름");
		
		int kor = tryCatchInt("국어");
		int eng = tryCatchInt("영어");
		int mat = tryCatchInt("수학");
		
		if(cnt == students.length) {
			students = Arrays.copyOf(students, students.length * 2); 
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(students[i]);
		}
//		System.out.println(Arrays.toString(students));
	}
	// 학생 이름, 점수 수정
	void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findByNo();
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.setName(nextLine("이름"));
		s.setKor(nextInt("국어"));
		s.setEng(nextInt("영어"));
		s.setMat(nextInt("수학"));
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findByNo();
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다."); 
			return;
		}
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i] == s) { // i = 1
				System.arraycopy(students, i + 1, students, i, cnt-- - i - 1);
				break;
			}
		}
	}
	
	private Student findByNo() {
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}
		return student;
	}
	
	
	public int tryCatchInt(String s) {
		int input;
		
		try {
			input = nextInt(s);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
			System.err.println("숫자만 입력하세요.");
			return -1;
		}
		
		return input;
	}
	
	public String tryCatchStr(String s) {
		String input;
		input = nextLine(s);
		
		
		
		if (2 > input.length() || input.length() > 4) {
			System.err.println("2~4 사이의 글자로 만들어주세요.");
		} 
		
		for (int i = 0; i < input.length(); i++) {
			if ((int)("가") <= (int)(input.charAt(i)) && input.charAt(i) <= "힣")	{
				
			}
		}
		
		
		
		System.out.println((int)(input.charAt(0)));

		return input;
	}
	
	
	
	
	
	
	
}