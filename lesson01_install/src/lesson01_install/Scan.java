package lesson01_install;

import java.time.LocalDate;

public class Scan {
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		LocalDate ld = LocalDate.now(); // 2024 8 29
		ld = ld.plusDays(-ld.getDayOfMonth() + 1); // 8 - 1
		
		int startDay = ld.getDayOfWeek().getValue(); // 4
		int lastDay = ld.lengthOfMonth(); // 31
		
		for(int i = 1 - startDay ; i <= lastDay ; i++) {
			if(i > 0) {
				System.out.printf("%3d", i);
			}
			else {
				System.out.printf("%3c", ' ');
			}
			if(i % 7 == 7 - startDay) {
				System.out.println();
			}
		}
	}
}
