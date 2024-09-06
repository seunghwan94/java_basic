package student;

import java.util.Scanner;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	
	static String nextLine(String msg) {
		System.out.print(msg);
		System.out.println("> ");
		return scanner.nextLine();
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
}
