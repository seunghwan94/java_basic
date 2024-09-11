package lesson11_exception;

import java.io.IOException;

public class ExceptionEx07 {
	public static void main(String[] args) {
		try {
			
			m1();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("가능");
	}
	
	static void m1() throws Exception {
		Exception exception = new Exception();
		throw exception;
	}
}

class A {
	void m() throws IOException{
		
	}
}

class B extends A {
	@Override
	public void m() throws IOException {
		// TODO Auto-generated method stub
		super.m();
	}
	
}
