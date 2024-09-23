package student_my_3;
import static student_my_3.StudentUtils.next;

import java.util.*;

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
		int no = next("학번", Integer.class, (t) -> findBy(t) == 0, "중복되지 않는 학번을 입력하세요");
		String name = next("이름", String.class, (t) -> checkName(t)!=null, "다시 입력하세요.");
		int kor = next("국어", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요.");
		int eng = next("영어", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요.");
		int mat = next("수학", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요.");

		students.add(new Student(no, name, kor, eng, mat));
	}
	// 학생 목록 조회
	public void list() {	
		int input = next("1.입력순 2.학번수 3.이름순 4.석차순", Integer.class, (t) -> checkRange(t, 1, 4) != -1, "다시 입력하세요." );
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
		// 익명클래스의 구현 내용 메서드 내부나 람다 문장에서는 지역변수는 final 취급합니다 -> 값변경 불가

		// 만약에 지금 하려는걸 적용하려면
		// 람다 들어가기전에 s의 값을 적용 완료해야해요
		// findBy의 결과를 59행에서 적용하면
		// 하려던거 할수있습니다

		int i = next("학번", Integer.class ,(t) -> findBy(t) != 0, "없는 학생입니다. 다시 입력해주세요.");
		
		Student s = students.get(i-1);

		s.setName(next("이름", String.class, (t) -> checkName(t) != null, "다시 입력하세요."));
		s.setKor(next("국어", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요."));
		s.setEng(next("영어", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요."));
		s.setMat(next("수학", Integer.class, (t) -> checkRange(t)!=-1, "다시 입력하세요."));
		
	}

	// 학생 삭제
	public void remove() {
		int i = next("학번", Integer.class ,(t) -> findBy(t) != 0, "입력한 학번은 존재하지 않습니다, 다시 입력해주세요.");
		students.remove(students.get(i-1));
	}

	private int findBy(int no) {
		int student = 0;
		
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = i;
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
			System.out.println("이름은 2글자에서 4글자 사이로 입력하세요");
			return null;
		}
		for(char c : chs) {
			if(c < '가' || c > '힣') {
				System.out.println("한글로 구성된 이름으로 작성하세요");
				return null;
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
	int checkRange(int number,int start, int end){
		if(number < start || number > end) {
			System.out.println(start + "이상" + end + "이하의 값을 입력하세요.");
			return -1;
		}
		return number;
	}
	int checkRange(int number){
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