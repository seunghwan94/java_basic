package student_teacher_1;

import static student_teacher_1.StudentUtils.*;

import java.util.Arrays;


// Logic
public class StudentService {
	private Student[] students = new Student[5];
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 61, 72);
		students[cnt++] = new Student(3, "말똥이", 20, 92, 10);
		students[cnt++] = new Student(4, "소똥이", 37, 64, 77);
	}
	
	
	
	// 학생 목록 조회
	public void list() {

		int choise = tryCatchInt("1.학번(오름차순) 2.이름(오름차순) 3.점수(내림차순)");
		if (choise == -1) return;
		if (range(choise,1,3) == -1) return;

		Student[] studentsTmp = Arrays.copyOf(students,students.length);
		
		// 정렬
		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < cnt-1; j++){
				if(listSort(choise, studentsTmp, j)){
					Student tmp = studentsTmp[j];
					studentsTmp[j] = studentsTmp[j+1];
					studentsTmp[j+1] = tmp;
				}
			}
		}
		System.out.println("===================================================");
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(studentsTmp[i]);
		}

	}
	
	
	// 학생 등록
	public void add() {
	
		int no = tryCatchInt("학번");
		if (no == -1) return;
		Student s = findByNo(no);

		if(s != null) {
			System.out.println("지정하신 학번은 있는 번호 입니다."); 
			return;
		}

		String name = tryCatchStr("이름");
		if (name == null) return;

		int kor = source("국어");
		int eng = source("영어");
		int mat = source("수학");

		if(cnt == students.length) {
			students = Arrays.copyOf(students, students.length * 2); 
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}


	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		int no = tryCatchInt("학번");
		if (no == -1) return;
		Student s = findByNo(no);
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}

		String name = tryCatchStr("이름");
		if (name == null) return;

		s.setName(name);
		s.setKor(source("국어"));
		s.setEng(source("영어"));
		s.setMat(source("수학"));
	}

	// 학생 삭제
	public void remove() {
		int no = tryCatchInt("학번");
		if (no == -1) return;
		Student s = findByNo(no);
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



	// 정렬 (조회)
	private boolean listSort(int target, Student[] Tmp, int j){
        switch (target) {
            case 1: // 1.학번(오름차순)
                return Tmp[j].getNo() < Tmp[j+1].getNo();
            case 2: // 2.이름(오름차순)
                return Tmp[j].getName().charAt(0) < Tmp[j+1].getName().charAt(0);
			case 3: // 3.점수(내림차순) 
				return Tmp[j].total() > Tmp[j+1].total();
            default:
                break;
        }
        return false;
	}
	
	// 점수 작성 (등록)
	private int source(String s){
		int target;

		while(true){
			target = tryCatchInt(s);
			target = range(target,0,100);
			if (target == -1) continue;
			break;
		}

		return target;
	}
	
	
	// 학번 찾기
	private Student findByNo(int no) {
		Student student = null;
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}
		return student;
	}
	
	// 숫자만 입력
	public int tryCatchInt(String s) {
		int input;
		try {
			input = nextInt(s);	
		}catch(NumberFormatException e){
			System.err.println("숫자만 입력하세요.");
			return -1;
		}
		return input;
	}
	// 범위
	public int range(int input, int start, int end){
		if (input == -1) {
			return input;
		}else if (input < start || end < input ){
			System.err.println(start + "~" + end + " 숫자만 입력하세요.");
			return -1;
		}
		return input;
	}
	// 문자만 입력
	public String tryCatchStr(String s) {
		String input = nextLine(s);
		String name = "";

		if (2 > input.length() || input.length() > 4) {
			System.err.println("2~4 사이의 글자로 만들어주세요.");
			return null;
		} 
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if ('가' > ch || ch > '힣'){
				System.out.println("정확한 한글로만 작성해주세요.");
				return null;
			}
			name += ch;
		}
		return name;
	}



}