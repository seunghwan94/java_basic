package student_teacher;

import student.StudentUtils;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		
		// 이름은 반드시 한글이여야한다.(영어 X 최대 글자수는 4글자)
		// 학번 중복 불허
		// 점수 0~100
		// 1.학번 오름차순, 2.이름 오름차순, 3.점수 내림차순 
		
		
		StudentService ss = new StudentService();
		
		while(true) {
			
			int input = ss.tryCatchInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");

			if (input == -1) {
				continue;
			}else if(1 > input || input > 5) {
				System.out.println("1~5번 사이의 숫자만 입력하세요.");
				continue;
			} 
			
			switch (input) {
			case 1:
				ss.list();
				break;
			case 2:
				ss.add();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.remove();
				break;
			case 5:
				System.out.println("bye");
				return;
			}
		}
	}
}