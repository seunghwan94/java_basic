package day2.ex2;

public class Init {
	private static Init init = new Init();
	
	public Init() {
		System.out.println("초기화");
	}
	
	
	public static void main(String[] args) {
		new Init(); 
		// 인스턴스 초기화가 반복 되서 오류가 나는데 static 키워드 붙게 되면 
		// 초기화가 한번 발생하고 끝난다. 
		
//		try {
//			
//			main(args);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		int result = 1;
		for (int i = 2; i <= 6; i++) {
			result *= i;
		}
		
		System.out.println(result);
		System.out.println(fact(6));
	}
	
	
	
	// 재귀 적 반복 ex. 팩도리얼
	static int fact(int i){
		if (i == 1) {
			return 1;
		}
		
		return fact(i -1) * i;
	}
	
	
}
