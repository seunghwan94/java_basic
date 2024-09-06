package day2;

public class Main {
	int i;
	static int si;
	void run() {
		System.out.println(si);
	}
	
	static void sRun() {
//		System.out.println(i); // 인스턴스 생성하기전에는 인스턴스 변수 생성 불가
//		System.out.println(this); // this 도 생성안된다. 주소를 봐야되는데 인스턴스 생성보다 빠름
	}
	
	public static void main(String[] args) {
		
		Main.sRun();
		
		System.out.println(InitMain.arr2.length);
		
		Class cls = InitMain.class;
//		Class cls1 = Class.forName("day2.InitMain");
	}
}
