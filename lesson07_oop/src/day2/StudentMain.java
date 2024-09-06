package day2;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student(10, "길동이"); // 생성자 1 호출
		Student student2 = new Student("길동이", 10); // 생성자 2 호출

		System.out.println(student1.no);
		System.out.println(student1.name);	
		
		student1.printThis();
		student1.returnThis().returnThis();
		
	}
}
