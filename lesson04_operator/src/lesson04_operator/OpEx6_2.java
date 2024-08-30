package lesson04_operator;

public class OpEx6_2 {
	public static void main(String[] args) {
		// 숫자를 문자열로
		int num = 10;
		String s = num + "";
		System.out.println(s);
		
		// 문자열을 숫자로
		int num2 = Integer.parseInt("1234");
		System.out.println(num2 % 10);
		
		String bin = "11010";
		int num3 = Integer.parseInt(bin, 2);
		System.out.println(num3);
		
	}
}
