package lesson05_control;

public class SwitchEx4 {
	public static void main(String[] args) {
		// 주민번호 검증 방법
		
		// 시작 숫자는 0
		String peopleNumber = "601105-12345678";
		String birth = peopleNumber.substring(0,6);
		char gender = peopleNumber.charAt(7);
		
		System.out.println(birth);
		switch(gender) {
			case '1','3':
				System.out.println("남자");
				break;
			case '2','4':
				System.out.println("여자");
				break;
			default:
				System.out.println("주민번호 이상");
		
		}
		
		int num1 = Integer.parseInt(peopleNumber.substring(0,1));
		int num2 = Integer.parseInt(peopleNumber.substring(1,2));
		int num3 = Integer.parseInt(peopleNumber.substring(2,3));
		int num4 = Integer.parseInt(peopleNumber.substring(3,4));
		int num5 = Integer.parseInt(peopleNumber.substring(4,5));
		int num6 = Integer.parseInt(peopleNumber.substring(5,6));
		
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.print(num4);
		System.out.print(num5);
		System.out.print(num6);
		
		char num7 = peopleNumber.charAt(6);
		System.out.print(num7);
		
		int num8 = peopleNumber.charAt(7) - '0';
		int num9 = peopleNumber.charAt(8) - '0';
		int num10 = peopleNumber.charAt(9) - '0';
		int num11 = peopleNumber.charAt(10) - '0';
		int num12 = peopleNumber.charAt(11) - '0';
		int num13 = peopleNumber.charAt(12) - '0';
		int num14 = peopleNumber.charAt(13) - '0';
		
		System.out.print(num8);
		System.out.print(num9);
		System.out.print(num10);
		System.out.print(num11);
		System.out.print(num12);
		System.out.print(num13);
		System.out.println(num14);
		
		int sum = 
				num1 * 2 + 
				num2 * 3 + 
				num3 * 4 + 
				num4 * 5 + 
				num5 * 6 + 
				num6 * 7 + 
				 
				num8 * 8 + 
				num9 * 9 + 
				num10 * 2 + 
				num11 * 3 + 
				num12 * 4 +
				num13 * 5;
		
		System.out.println(sum);
		
		int result = (11 - sum % 11) % 10;
		
		System.out.println(result == num14);
				
				
		
		
		
	}
}
