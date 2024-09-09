package day2.ex2;

public class Singleton {	
	private static Singleton singleton = new Singleton(); // stactic을 해야 안터진다.
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
