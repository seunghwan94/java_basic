package day2.ex2;

public class SingletonTest {
	// final : class, method, field 전부 가능 (단 의미가 다 다름)
	// class final  : 이 class에서 더이상 상속 OverRidding 하지말아라
	// method final : OverRidding 금지 (재정의 해용 X)
	// field final  : 가능
	// ∴ 인스턴스 초기화 전까지만 상수에 대한 정의만 되있으면 문제 없다.!!
	
	public static void main(String[] args) {
		// 결론은 같은 인스턴스를 바라본다.
		Singleton s1 = Singleton.getInstance(); 
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		// 회원 (CRUD) 
		// 책   (CRUD)
		// 구매 
		
		
		
		
		
	}
}
