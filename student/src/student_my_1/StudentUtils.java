package student_my_1;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	
	static String nextLine(String msg) {
		System.out.print(msg);
		System.out.println("> ");
		return scanner.nextLine();
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}

	static void menuPhrase(String menu, String startOrEnd){
		System.out.println("\n---------------------------");
		System.out.printf("%9s 메뉴 %s\n", menu,startOrEnd);
		System.out.println("---------------------------\n");
	}
	// 입력 통합
		static <T> T next(String msg, Class<T> clazz) {
			System.out.println(msg);
			System.out.print("> ");
			String str = scanner.nextLine();
			if (clazz == Integer.class) {
				return clazz.cast(Integer.parseInt(str));
			} else if (clazz == String.class) {
				return clazz.cast(str);
			} else {
				throw new RuntimeException("잘못된 타입");
			}
		}
		/*
		 * () -> {} Runnable (1) -> {} Consumer () -> {1} Supplier (1) -> {1} Function
		 * (1) - > {b} Predicate
		 */

		// 입력 반복
		static <T> T next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
			while (true) {
				try {
					T t = next(msg, clazz);
					if (con.test(t)) {
						return t;
					} else {
						throw new IllegalArgumentException(errMsg);
					}
				} catch (IllegalArgumentException iae) {
					System.out.println(iae.getMessage());
				}
			}
		}
}
