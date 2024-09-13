package student_1;

public class StudentTest {
	public static void main(String[] args) {		
		Student s1 = new Student(1,"새똥이",3,4,5);
		// 복제 방법
		// 1. clone override
		//		- 접근제어, 타입, 예외, Cloneable 인터페이스
		// 2. 생산자를 통한 복제
		
		
		Student s2 = s1.clone();
		s1.setName("개똥이");
		System.out.println(s2);
		System.out.println(s1);
		Student s4 = new Student(s1);
		System.out.println(s4);
		Student s5 = s1;
		System.out.println(s5==s1);
		System.out.println(s5.equals(s1));
		System.out.println(s5.equals(s4));
		System.out.println(s5==s4);
	}
	
}
