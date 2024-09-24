package student_teacher_4;
import static student_teacher_4.StudentUtils.next;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import student_my_4.Student;
import student_teacher_1.RangeException;

// Logic
@SuppressWarnings("unchecked")
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> studentsTotalSort;
	private List<Student> studentsNoSort;
	private List<Student> studentsNameSort;
	
	{
			
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students_teacher.ser"))){
			students = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			students.add(new Student(1, "새똥이", 20, 90, 100));
			students.add(new Student(2, "개똥이", 100, 66, 77));
			students.add(new Student(3, "대똥이", 40, 90, 100));
			students.add(new Student(4, "래똥이", 57, 66, 77));
			System.out.println("초기화 데이터");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		cloneAndSort();
		
	}
	// 학생 등록
	public void add() {
		int no = next("학번", Integer.class, n -> findBy(n) == null, "입력한 학생이 존재합니다.");
		String name = next("이름", String.class, n -> n.matches("^[가-힣]*{2,4}$"), "올바른 이름을 입력하세요(한글, 2~4글자)");
		int kor = next("국어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");
		int eng = next("영어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");
		int mat = next("수학", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");

		
		students.add(new Student(no, name, kor, eng, mat));
	}
	// 학생 목록 조회
	public void list() {
		int input = next("1.입력순 2.학번수 3.이름순 4.석차순", Integer.class, i -> i <= 4 && i >= 1, "1이상 4이하의 값을 입력하세요.");
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
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "입력한 학생이 존재하지 않습니다."));
		String name = next("이름", String.class, n -> n.matches("^[가-힣]*{2,4}$"), "올바른 이름을 입력하세요(한글, 2~4글자)");
		int kor = next("국어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");
		int eng = next("영어", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");
		int mat = next("수학", Integer.class, i -> i <= 100 && i >= 0, "0이상 100이하의 값을 입력하세요.");

		
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "입력한 학생이 존재하지 않습니다."));
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
		save();
	}
	
	public void save() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students_teacher.ser"))){
			oos.writeObject(students);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}

class MyComp implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o2.total() - o1.total();
	}
}