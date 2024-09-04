package lesson07_oop;

public class Car {
	// 필드
	String color;
	String company;
	String type;
	/**
     * 전진하는 메서드
     */
	public void go() {
		System.out.println("전진");
	}
	/**
     * 후진하는 메서드
     */
	public void back() {
		System.out.println("후진");
	}
	
}
