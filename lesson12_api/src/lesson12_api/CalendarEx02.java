package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		System.out.println(sdf);
		
		System.out.println(sdf.format(new Date(cal.getTimeInMillis()))); // 2024-09-13 
		
		cal.add(Calendar.DATE, -10000); // 10000일 전
		System.out.println(sdf.format(new Date(cal.getTimeInMillis()))); // 1997-04-28 
		
		cal.add(Calendar.MONTH, 200); // 200일 후
		System.out.println(sdf.format(new Date(cal.getTimeInMillis()))); // 2013-12-28
		
		cal.roll(Calendar.DATE, 4); // ?
		System.out.println(sdf.format(new Date(cal.getTimeInMillis()))); // 2013-12-01
		
		
	}
}
