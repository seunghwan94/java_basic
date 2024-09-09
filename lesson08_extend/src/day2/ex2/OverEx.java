package day2.ex2;

public class OverEx {
	public static void main(String[] args) {
		// bind : 관계 형성, 어떤 객체가 특정 멤버를 호출 시 대상을 지정
		// 정적 바인드 (Static Bind) : 컴파일 시 지정
		// 동적 바인드 (Dynamic Bind) : 런타임 시 지정 (ex. 오버라이딩)
		
//		A obj = new B();
//		System.out.println(obj.i); // 정적 바인드
//		obj.m(); // 동적 바인드
//		System.out.println(obj.si); // 정적 바인드
//		obj.sm(); // 정적 바인드
		
	}

}

//class A{
//	static int si = 1;
//	int i = 2;
//	void m () {
//		System.out.println("m");
//	}
//	static void sm () {
//		System.out.println("sm");
//	}
//}
//
//class B extends A{
//	static int si = 4;
//	int i = 4;
//	void m () {
//		System.out.println("mm");
//	}
//	static void sm () {
//		System.out.println("smm");
//	}
//	
//}