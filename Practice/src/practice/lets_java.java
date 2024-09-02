package practice;

public class lets_java {
	public static void main(String[] args) {
		prac_4_1();
		prac_4_2();
		prac_4_3();
		prac_4_4();
		prac_4_5();
		prac_4_6();
		prac_4_7();
	}
	public static void prac_4_1() {
		// 다음연산자들의 의미를 설명하시오.
		// += : 우측항의 값을 좌항 값에 더하여 좌항에 대입
		// -= : 우측항의 값을 좌항 값에 빼고 좌항에 대입
		// %= : 우측항의 값을 좌항 값에 나머지를 구하여 좌항에 대입
	}
	public static void prac_4_2() {
		// 다음 코드의 실행 결과를 작성하시오.
		 int var = 7 - 1 * 20 / 5; // 3
		 System.out.println(var);
	}
	public static void prac_4_3() {
		// 한 반에 27명인 학급이 있다. 미술 수업을 위해 색연필을 5다스를 받았다면, 각 학생에게 나누어 줄 수 있는
		// 색연필 수와 나눠 주고 남은 색연필 수를 출력하는 프로그램을 작성하시오.		
	 
		 int colorPen = 5 * 12; // ? = 12, 60
		 int studentCount = 27;
		 int divColorPen = colorPen / studentCount; // 2 
		 System.out.println(divColorPen);
		 int remainColorPen = colorPen % studentCount; // 6 
		 System.out.println(remainColorPen); 
	}
	public static void prac_4_4() {
		// 아이와 함께 놀이동산에 놀러가서 롤러코스터를 타려고하는데 안내 문구가 아래와 같이 적혀있다.
		// 1. 6세 이상 탑승 가능 (단, 키가 120cm 이상이면 보호자 동반 하에 탑승 가능)
		// 2. 키 120cm 이상 탑승 가능
		// 3. 심장 관련 질환자 탑승 불가
		int age = 0;
		int height = 0;
		boolean parent = true;
		boolean hearchDease = true;
		
		boolean result =  !hearchDease && height >= 120 && (age < 6 && parent); 
		
		System.out.println(result);
		
	}
	public static void prac_4_5() {
		// 다음 코드는 입력된 연도가 윤년인지 아닌지 판단하는 코드이다. 빈칸에 들어갈 조건식을 작성하시오.
		// 1. 연도를 4로 나누어 떨어지면 윤년
		// 2. 100으로 나누어 떨어지는 연도는 윤년이 아님
		// 3. 400으로 나누어 떨어지면 윤년
		
		int year = 2020;
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		System.out.println(leapYear);
		
	}
	public static void prac_4_6() {
		// 가게에서 물건을 구매하고 금액을 지불하려고 한다. 지불해야할 금액이 187,000원인데 5만원권과 1만원, 5천원, 천원 권
		// 지폐를 가장 적은 지폐수량으로 지불하는 코드를 작성해라.
		
		int price = 187000;
		int oman = price / 50000;
		int ilman = price % 50000 / 10000;
		int ochun = price % 10000 / 5000;
		int ilchun = price % 5000 / 1000;
		System.out.println(oman);
		System.out.println(ilman);
		System.out.println(ochun);
		System.out.println(ilchun);
		
	}
	public static void prac_4_7() {
		// 아래 코드에서 정수 타입 변수 number에서 십의자리 이하를 버리는 코드를 작성하려고 한다. 빈칸에 코드 작성해라.
		// ex. 1234 -> 1200, 123 -> 100;
		
		int number = 1234;
		int result = number / 100 * 100;
		
		System.out.println(result);
		
	}
	
}
