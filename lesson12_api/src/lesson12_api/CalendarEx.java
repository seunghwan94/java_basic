package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;


public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		
		
		Date date = new Date(cal1.getTimeInMillis());
		date.setTime(cal1.getTimeInMillis());
		
		
		cal1.setTimeInMillis(date.getTime());
		System.out.println();
		
		int year = cal1.get(YEAR);
		System.out.println(year);
		System.out.println(cal1.get(1)); // 1월 = 0
		System.out.println(cal1.get(DAY_OF_MONTH)); // 13일
		System.out.println(cal1.get(DAY_OF_WEEK)); // 일요일 = 1, 토요일 = 7
		System.out.println(cal1.get(DATE));
		
		cal1.set(DATE, 15);
		System.out.println(cal1.get(DATE));
		System.out.println(cal1.get(DAY_OF_WEEK));
		System.out.println(cal1.get(DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal1.get(ZONE_OFFSET)/ 1000 / 60 / 60);
		
		
		
	}
}
