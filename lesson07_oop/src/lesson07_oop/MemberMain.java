package lesson07_oop;

public class MemberMain {
	
	public static void main(String[] args) {
		// 제품 생성
		// new Member() : 인스턴스 (new = 연산자)
		// Member : 클래스, 인터페이스, 배열 타입
		// m : 객체(변수)
		
		// 자기 자신(class) 호출가능
		MemberMain mm = new MemberMain();
		MemberMain mm2 = new MemberMain();
		
		Member m = new Member(); 	// 인스턴스 생성
		Member m2 = new Member();	// 인스턴스 생성
		
		if(m == m2) {
			System.out.println("같은 객체");
			System.out.println(m);
			System.out.println(m2);
		}else {
			System.out.println("다른 객체");
			System.out.println(m);
			System.out.println(m2);
		}
		
		m.age = 10;
		m.kor = 10;
		m.eng = 20;
		m.mat = 30;
		
		System.out.println(m.total());
	}
}
