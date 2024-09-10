package lesson10_inner;

public class LocalTest {
	
	static MyInter create() {
		class MyClass implements MyInter{
			@Override
			public void run() {
				System.out.println("myclass run()");
				
			}
			
		}
		return new MyClass();
	}
	
	static MyInter create2() {
		
		return new MyInter() {
			@Override
			public void run() {
				System.out.println("myInter create2");
			}
		};
	}
	
	static MyInter create3() {
		return () ->System.out.println("create3"); 
	}
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();
		
	}
}

interface MyInter {
	void run();
}