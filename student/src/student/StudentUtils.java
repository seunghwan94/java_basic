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

	static void menuPhrase(String menu, String startOrEnd){
		System.out.println("\n---------------------------");
		System.out.printf("%9s 메뉴 %s\n", menu,startOrEnd);
		System.out.println("---------------------------\n");
	}
}
