package test2;

public class Test1 {
	public static void main(String[] args) {
		Test2 test = new Test2(null);
		test.a();
		test.b();
		System.out.println(test);
		
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