package lesson09_interface_ex;

public interface Repairable {
	static void sm() {
		System.out.println("sm()");
	}
	
	default void dm() {
		System.out.println("dm()");
	}
}
