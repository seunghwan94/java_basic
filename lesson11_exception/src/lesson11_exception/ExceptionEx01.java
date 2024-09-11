package lesson11_exception;


public class ExceptionEx01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {			
			System.out.println(2);
			
//			System.out.println(args[0]);
//			System.out.println(3/0);
			Integer.parseInt("a"); // NumberFormatException
			System.out.println(3/0); // IndexOutOfBoundsException
			System.out.println(args[0]); // ArithmeticException 
			
			
			
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(5);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(6);
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(7);
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
			
			StackTraceElement[] elements = e.getStackTrace();
			
			for(StackTraceElement ste : elements) {
				System.out.println(ste.getMethodName());
			}
		}
		System.out.println(8);		
		
//		new Exception()
	}
}
