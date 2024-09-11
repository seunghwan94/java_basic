package lesson11_exception;

public class ExceptionEx05 {
	public static void main(String[] args) {
		System.out.println("main 전");
		m1();
		System.out.println("main 후");
	}
	static void m1() {
		m2();
	}
	static void m2() {
		try {
			m3();
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	static void m3() {
		try {
			
			m4();
		}catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	static void m4() {
		ArithmeticException e =new ArithmeticException("0으로 나눔");
		try {
			throw e;
			
		}catch (Exception e2) {
			System.out.println("sss");
			System.out.println(e2.getMessage());
		}
	}
	
}
