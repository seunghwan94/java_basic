package test2;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		
		String s = "가";
		String e = "힣";
//		System.out.println((int)s.charAt(0));
//		System.out.println((int)e.charAt(0));
		System.out.println((int)e.charAt(0)-(int)s.charAt(0));

		
		
		char s1 ='가';
		char e1 = '힣';
		System.out.println(e1-s1);
		
		
		
		
		
		
//		Test2 test = new Test2(null);
//		test.a();
//		test.b();
//		System.out.println(test);
//		
	}

}
abstract class Test {
	String name;

	public Test(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	abstract void a();
	abstract void b();

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

}


class Test2 extends Test {

	public Test2(String name) {
		super("테스트다");
		// TODO Auto-generated constructor stub
	}

	@Override
	void a() {
		// TODO Auto-generated method stub
		System.out.println("aaaaa");
	}

	@Override
	void b() {
		// TODO Auto-generated method stub
		System.out.println("bbbbb");
	}
	
	
}