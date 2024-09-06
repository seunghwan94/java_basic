package day2;

public class Student {
	int no;			// 학번
	String name; 	// 이름
	///////////////////////// 생성자 시작	/////////////////////////
	// 생성자 1
	Student(int i, String s){
		no = i;
		name = s;
	}
	// 생성자 2
	Student(String s, int i){
		this(i,s); // 생성자 1 호출
	}
	void printThis() {
		System.out.println(this);
	}
	
	Student returnThis() {
		return this;
	}
}
