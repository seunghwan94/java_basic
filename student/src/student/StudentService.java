package student;

// Logic + 데이터 관리
public class StudentService {
	
	Student[] students = new Student[5];
	int cnt;
	
	{
		students[cnt++] = new Student(1, "똘기", 80, 90, 100); 
		students[cnt++] = new Student(2, "떵이", 30, 20, 77); 
		
	}
	// 학생 등록
	void add() {
		System.out.println("add()");
	}
	
	// 학생 목록 조회
	void list() {
		System.out.println("list()");
		System.out.println("학번  이름  국어  영어  수학  총점  평균");
		System.out.println("========================================");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%5d %5s %5d %5d %5d %5d %5.2f \n",
						students[i].no,
						students[i].name,
						students[i].kor,
						students[i].eng,
						students[i].mat,
						students[i].total(),
						students[i].avg()
					);
		}
	}
	
	// 학생 이름, 점수 수정
	void modify() {
		System.out.println("modify()");
	}
	
	// 학생 삭제
	void remove() {
		System.out.println("remove()");
	}
	
	
}
