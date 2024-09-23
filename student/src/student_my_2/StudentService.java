package student_my_2;
import static student_my_2.StudentUtils.*;

import java.util.Arrays;

import student_teacher_1.RangeException;

// Logic
public class StudentService {
	String s = "ssss";
	private Student[] students = new Student[5];
	private Student[] studentsTotalSort;
	private Student[] studentsNoSort;
	private Student[] studentsNameSort;
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(4, "개똥이", 77, 66, 77);
		
		cloneAndSort();
		
	}
	// 학생 등록
	public void add() {
		int no = nextInt("학번");
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
		}
		String name = nextLine("이름");
		checkName(name);
		int kor = checkRange(nextInt("국어"));
		int eng = checkRange(nextInt("영어"));
		int mat = checkRange(nextInt("수학"));

		if(cnt == students.length) {
			students = Arrays.copyOf(students, students.length * 2); 
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
		int input = checkRange(nextInt("1.입력순 2.학번수 3.이름순 4.석차순"), 1, 4);
		Student[] tmp = null;
		switch(input) {
			case 1:
				tmp = students;
			case 2:
				tmp = studentsNoSort;
			case 3:
				tmp = studentsNameSort;
			case 4:
				tmp = studentsTotalSort;
		}
		
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(tmp[i]);
		}
	}
	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findBy(nextInt("학번"));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.setName(checkName(nextLine("이름")));
		s.setKor(checkRange(nextInt("국어")));
		s.setEng(checkRange(nextInt("영어")));
		s.setMat(checkRange(nextInt("수학")));
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findBy(nextInt("학번"));
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
	
	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}
		return student;
	}
	/**
	 * 학생이름 유효성 검증, 이름은 반드시 한글, 최소 2 최대 4글자의 한글
	 * @param name 학생의 이름
	 */
	String checkName(String name) {
		char[] chs = name.toCharArray();
//		String s = new String(chs);
		if(chs.length < 2 || chs.length > 4) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
		}
		// '가', '나', '다', '라'
		for(char c : chs) {
			if(c < '가' || c > '힣') {
				throw new RuntimeException("한글로 구성된 이름으로 작성하세요");
			}
		}
		return name;
	}
	/**
	 * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * @param number 검증대상 숫자
	 * @param start 시작 값
	 * @param end 종료 값
	 * @param return 원래 값
	 */
	int checkRange(int number,int start, int end) throws RangeException{
		if(number < start || number > end) {
			throw new RangeException(start,end);
		}
		return number;
	}
	int checkRange(int number) throws RangeException{
		return checkRange(number,0,100);
	}
	
	// 정렬
	void cloneAndSort() {
		studentsNoSort = students.clone();
		studentsNameSort = students.clone();
		studentsTotalSort = students.clone();
		
		sort(0,studentsNoSort);
		sort(1,studentsNameSort);
		sort(2,studentsTotalSort);
	}
	
	void sort(int type, Student[] target) {
		Student[] arr = target;
		for (int i = 1; i < cnt - 1; i++) {
			for (int j = 0; j < cnt - i; j++) {
				
				boolean codition = false;
				
				switch(type) {
					case 0:
						codition = arr[j].getNo() > arr[j+1].getNo();
						break;
					case 1:
						codition = arr[j].getName().compareTo(arr[j+1].getName()) > 0;
						break;
					case 2:
						codition = arr[j].total() > arr[j+1].total();
						break;
					default:
						break;
				}
				
				
				if(codition) {
					Student tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
}
