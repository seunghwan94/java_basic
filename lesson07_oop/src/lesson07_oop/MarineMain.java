package lesson07_oop;

public class MarineMain {
	public static void main(String[] args) {
		Marine marine = new Marine();
		
		// 현재 체력
		System.out.println(marine.hp);
		
		marine.hp -= 5 * 6; // 체력 까임
		System.out.println(marine.hp);
		
		Marine.att++; // 공업
		System.out.println(Marine.att);
		
	}
}
