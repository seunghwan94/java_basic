package student;

import java.io.*;
import java.util.Arrays;

// Logic + 데이터 관리
public class StudentService {
	
	Student[] students = new Student[3];
	String[] objectName = {"국어","영어","수학"};
	int cnt;
	// String dataPath = "./student/src/student/DB.txt";
	String filePath = "./student/DB.txt";
	
	{
		try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
			
            while ((line = br.readLine()) != null) {
				String[] fields = line.split("\t");

				// 데이터 파싱 Student 객체 생성
				int no = Integer.parseInt(fields[0]);
				String name = fields[1];
				int kor = Integer.parseInt(fields[2]);
				int eng = Integer.parseInt(fields[3]);
				int mat = Integer.parseInt(fields[4]);
				char is_set = fields[5].charAt(0);

				students[cnt++] = new Student(no, name, kor, eng, mat, is_set); 
            }
            
            br.close(); // 닫기
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	// 학생 등록
	void add() {

		String check;
		int kor;
		int eng;
		int mat;

		while(true){
			StudentUtils.menuPhrase("등록", "선택");
			System.out.println("이름, 국어, 영어, 수학 순으로 입력해주세요.");
			String name = StudentUtils.nextLine("이름");
			try{
				kor = StudentUtils.nextInt("국어");
				eng = StudentUtils.nextInt("영어");
				mat = StudentUtils.nextInt("수학");
			}catch(Exception e){
				System.out.println("숫자만 입력해 ㅡㅡ");
				continue;
			}

			System.out.println(" 이름  국어  영어  수학");
			System.out.printf("%5s %5d %5d %5d\n", name, kor, eng, mat);
			
			if (0 > mat || mat > 100 || 0 > eng || eng > 100 || 0 > kor || kor > 100){
				System.out.println("0~100 사이 숫자만 가능 다시");
				continue;	
			}


			check = StudentUtils.nextLine("입력한 정보가 맞습니까? (Y/N)");

			if (check.equals("Y") || check.equals("y")){
				// Array 길이 체크
				if (cnt == students.length){
					students = Arrays.copyOf(students, students.length * 2);
				}

				students[cnt++] = new Student(cnt, name, kor, eng, mat, 'Y'); 
				check = StudentUtils.nextLine("등록 되었습니다. 계속 진행하시겠습니까? (Y/N)");	
				
				if(check.equals("Y") || check.equals("y")){
					continue;
				}else{
					StudentUtils.menuPhrase("등록", "종료");
					break;
				}

			} else {

				check = StudentUtils.nextLine("입력한 정보를 초기화했습니다. 다시 등록하시겠습니까? (Y/N)");
				
				if(check.equals("Y") || check.equals("y")){
					continue;
				}else{
					StudentUtils.menuPhrase("등록", "종료");
					break;
				}
			}
		}
		


	}
	
	// 학생 목록 조회
	void list() {
		int upAndDown;
		int listMenuChoise;
		StudentUtils.menuPhrase("조회", "선택");
		listView(students);

		while(true){
			String check = StudentUtils.nextLine("정렬을 원하시면 Y 종료를 원하시면 N을 눌러주세요.");
			if (check.equals("y") || check.equals("Y")){
				try{
					listMenuChoise = StudentUtils.nextInt("1.학번 2.이름 3.점수 4.종료");
					upAndDown = StudentUtils.nextInt("1.오름차순  2.내림차순");
				}catch (Exception e){
					System.out.println("숫자만 입력해라 ㅡㅡ ");
					continue;
				}

				Student[] studentsTmp = new Student[cnt];
				studentsTmp = Arrays.copyOf(students,students.length);

				switch (listMenuChoise) {
					case 1:
						// 학번 sort
						for(int i = 0; i < studentsTmp.length; i++){
							for(int j = 0; j < studentsTmp.length-1; j++){
								// 오름차순
								if(upAndDown == 1){
									if(studentsTmp[j].no < studentsTmp[j+1].no){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}	
								}else{
								// 내림차순
									if(studentsTmp[j].no > studentsTmp[j+1].no){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}
								}
							}	
						}	
						
						break;
					case 2:
						// 이름
						for(int i = 0; i < studentsTmp.length; i++){
							for(int j = 0; j < studentsTmp.length-1; j++){
								// 오름차순
								if(upAndDown == 1){
									if(studentsTmp[j].name.charAt(0) < studentsTmp[j+1].name.charAt(0)){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}	
								}else{
								// 내림차순
									if(studentsTmp[j].name.charAt(0) > studentsTmp[j+1].name.charAt(0)){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}
								}
							}	
						}	
						break;
					case 3:
						// 점수
						for(int i = 0; i < studentsTmp.length; i++){
							for(int j = 0; j < studentsTmp.length-1; j++){
								// 오름차순
								if(upAndDown == 1){
									if(studentsTmp[j].total() < studentsTmp[j+1].total()){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}	
								}else{
								// 내림차순
									if(studentsTmp[j].total() > studentsTmp[j+1].total()){
										Student tmp = studentsTmp[j];
										studentsTmp[j] = studentsTmp[j+1];
										studentsTmp[j+1] = tmp;
									}
								}
							}	
						}	
						break;
				}
				listView(studentsTmp);
				continue;
			}
			break;
		}
		StudentUtils.menuPhrase("조회", "종료");
	}
	void listView(){
		System.out.println("=============");
		System.out.println(" 학번  이름 ");
		System.out.println("=============");
		for (int i = 0; i < cnt; i++) {
			if(students[i].is_set == 'Y'){
				System.out.printf("%3d %7s \n",
							students[i].no,
							students[i].name
						);
			}
		}
	}
	void listView(Student[] list){
		System.out.println("========================================");
		System.out.println("학번  이름  국어  영어  수학  총점  평균");
		System.out.println("========================================");
		for (int i = 0; i < cnt; i++) {
			if(list[i].is_set == 'Y'){
				System.out.printf("%2d %5s %5d %5d %5d %5d %5.2f \n",
					list[i].no,
					list[i].name,
					list[i].kor,
					list[i].eng,
					list[i].mat,
					list[i].total(),
					list[i].avg()
				);
				System.out.println("----------------------------------------");
			}
		}

	}


	// 학생 이름, 점수 수정
	void modify() {
		int idx;
		int choise;
		int score;
		int[] scoreList = new int[3];

		StudentUtils.menuPhrase("수정", "선택");
		listView();

		while(true){
			try{
				idx = StudentUtils.nextInt("학번을 입력해 주세요. (종료 : 0)") - 1;
			}catch (Exception e){
				System.out.println("숫자만 입력해라 ㅡㅡ ");
				continue;
			}

			if (idx == -1){
				StudentUtils.menuPhrase("수정", "종료");
				break;
			}else if (idx < 0 || cnt-1 < idx){
				System.out.println("학번이 없거나 잘못입력하셨습니다.");
				continue;
			}

			System.out.println(students[idx].name + "님을 선택하셨습니다. 수정할 목록의 번호를 선택해주세요. (종료 : 0)");
			
			try{
				choise = StudentUtils.nextInt("1.이름 2.국어 3.영어 4.수학 5.전체수정");
			}catch (Exception e){
				System.out.println("번호로 선택하라고 짜증나니까 처음부터 다시해");
				continue;
			}

			if(choise == 0){
				StudentUtils.menuPhrase("수정", "종료");
				break;
			}else if(0 < choise && choise < 5){
				switch (choise) {
					// 과목 수정
					case 5:
						
						while(true){
							try{
								for (int i = 0; i < objectName.length; i++ ){
									scoreList[i] = StudentUtils.nextInt(objectName[i] + "과목의 점수를 작성해주세요.");
									if(0 < scoreList[i] && scoreList[i] <= 100){
										System.out.println("0~100 사이만 입력해주세요.");
										break;
									}
								}

							}catch (Exception e){
								System.out.println("숫자만 입력해라 ㅡㅡ ");
								continue;
							}
							break;
						}
						for (int i = 0; i < objectName.length; i++ ){
							students[idx].modifyScore(objectName[i], scoreList[i]);
						}
						break;
					case 2,3,4:
						while(true){
							try{
								score = StudentUtils.nextInt(objectName[choise-2] + "과목의 점수를 작성해주세요.");
								if(0 < score && score <= 100){
									break;
								}
							}catch (Exception e){
								System.out.println("숫자만 입력해라 ㅡㅡ ");
								continue;
							}
							System.out.println("0~100 사이만 입력해주세요.");
						}
						students[idx].modifyScore(objectName[choise-2], score);
						break;
					// 이름 수정
					case 1:
						String name = StudentUtils.nextLine("변경하실 이름을 작성해주세요.");
						students[idx].modifyName(name);
						break;
				}
				System.out.println("수정되었습니다. 수정을 계속 진행하시겠습니까? (숫자만 입력)");
				try{
					if(StudentUtils.nextInt("1.계속  2.종료") == 2){
						StudentUtils.menuPhrase("수정", "종료");
						break;
					}
				}catch (Exception e){
					System.out.println("숫자입력을 안해서 종료");
					StudentUtils.menuPhrase("수정", "종료");
					break;
				}

				
			}else{
				System.out.println("잘못 입력하셨습니다. 다시 진행해주시기 바랍니다.");
			}

		}
	}
	
	// 학생 삭제
	void remove() {
		StudentUtils.menuPhrase("삭제", "선택");

		int idx; 
		String check;

		while(true){
			listView();
			try{
				idx = StudentUtils.nextInt("삭제할 학생의 학번을 입력해 주세요. (종료 : 0)") - 1;
			}catch (Exception e){
				System.out.println("숫자만 입력해라 ㅡㅡ ");
				continue;
			}

			if (idx == -1){
				StudentUtils.menuPhrase("삭제", "종료");
				break;
			}else if (idx < 0 || cnt-1 < idx){
				System.out.println("학번이 없거나 잘못입력하셨습니다.");
				continue;
			}

			check = StudentUtils.nextLine(students[idx].name + "님을 정말로 삭제하시겠습니까? (Y/N)");
			
			if(check.equals("Y") || check.equals("y")){
				students[idx].remove();
				System.out.println("삭제 되었습니다.");
			}else{
				System.out.println("삭제가 취소 되었습니다.");
			}
			listView();
			StudentUtils.menuPhrase("삭제", "종료");
			break;
		}
	}
	void exit(){
		try {
			File file = new File(filePath);
            FileWriter fw = new FileWriter(file); 
            BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < cnt; i++) {

				String data = students[i].no + "\t" +
								students[i].name + "\t" +
								students[i].kor + "\t" +
								students[i].eng + "\t" +
								students[i].mat + "\t" +
								students[i].is_set;
				bw.write(data);
				bw.newLine();

			}
			bw.close();

            System.out.println("성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일에 쓰는 도중 오류가 발생했습니다.");
            e.printStackTrace();
        }
	}
	
	
}
