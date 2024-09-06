package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI 담당
		
		// Create Read Update Delete (CRUD)
		// Read : 학번순 이름순 오름 내림
		// Delete : 학번을 입력해서 삭제
		
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		
		while(true) {

			int input = StudentUtils.nextInt("1. 조회  2.등록  3.수정  4.삭제  5.종료");
			
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
					ss.modify();
					break;
					
				case 5:
					System.out.println("bye");
					return;
				default:
					break;
			
			}
			
		}
		
		
	}
}
