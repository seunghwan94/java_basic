package lesson03_variable;

public class FloatDoubleEx {
	public static void main(String[] args) {
		double d3 = 0.12345678901234567890f;
		float f2 = (float)d3;
		System.out.println(d3);
		
		
		float f = 3.141592653589793f;
		double d = 3.141592653589793d;
		
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		
		double d2 = 3.141592653589793; // d는 생략가능
		
		System.out.println("double : " + d2);
	}
}
