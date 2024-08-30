package lesson04_operator;

public class OpEx6_1 {
	public static void main(String[] args) {
		System.out.println("1234567890123456789012345678901234567890");
		System.out.println("========================================");
		String s = Integer.toBinaryString(10);
		System.out.printf("%032d\n", Integer.parseInt(s));
		String s2 = Integer.toBinaryString(6);
		System.out.printf("%032d\n", Integer.parseInt(s2));
		
		String s3 = Integer.toBinaryString(-3);
		System.out.println(s3);
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(max + ", " + min);
		
		System.out.println("0" + Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		
		System.out.println();
		
		System.out.println(max + 1);
		
		// Integer.toBinaryString(int) : String
		// Integer.parseInt(String) : int
		
		
	} 
}
