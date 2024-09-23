package student_teacher_2;
import static student_teacher_2.StudentUtils.*;

import java.util.*;

import student_teacher_1.RangeException;

// Logic
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> studentsTotalSort;
	private List<Student> studentsNoSort;
	private List<Student> studentsNameSort;
	
	{
		students.add(new Student(1, "새똥이", 20, 90, 100));
		students.add(new Student(2, "개똥이", 100, 66, 77));
		students.add(new Student(3, "대똥이", 40, 90, 100));
		students.add(new Student(4, "래똥이", 57, 66, 77));		
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
		
		students.add(new Student(no, name, kor, eng, mat));
	}
	// 학생 목록 조회
	public void list() {
		int input = checkRange(nextInt("1.입력순 2.학번수 3.이름순 4.석차순"), 1, 4);
		List<Student> tmp = null;
		switch(input) {
			case 1:
				tmp = students;
				break;
			case 2:
				tmp = studentsNoSort;
				break;
			case 3:
				tmp = studentsNameSort;
				break;
			case 4:
				tmp = studentsTotalSort;
				break;
		}
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < students.size() ; i++) {
			System.out.println(tmp.get(i));
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
		students.remove(s);
	}
	
	private Student findBy(int no) {
		Student student = null;
		
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
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
		if(chs.length < 2 || chs.length > 4) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
		}
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
		studentsNoSort =  new ArrayList<Student>(students);
		studentsNameSort = new ArrayList<Student>(students);
		studentsTotalSort = new ArrayList<Student>(students);
		
		studentsNoSort.sort((o1,o2)->o1.getNo()-o2.getNo());
		
		
		//studentsNameSort.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		studentsNameSort.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		studentsTotalSort.sort((o1,o2)->o1.total()-o2.total());
		MyComp comp = new MyComp();
		studentsTotalSort.sort(comp);
	}
}

class MyComp implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o2.total() - o1.total();
	}
}