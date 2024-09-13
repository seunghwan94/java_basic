package calender;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static calender.CommonUtils.*;

public class Calender {
	public static void main(String[] args) {
		// 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
		CalendarEx();
		
		// URL 분석 (String Class 사용)
//		URL();
		
	
	}
	static void CalendarEx() {
		
//		int input = nextInt("1.이전달  2.다음달  3.이전해  4.다음해  5.특정 연월  6.종료");
		


//		String date = nextLine("달입력 yyyy-mm-dd");
		

		

		
		
//		while(true) {
//		System.out.println(cal2.get(DAY_OF_MONTH));
//		cal2.roll(cal2.get(DAY_OF_WEEK),false);
//			
////		}
//		System.out.println(sdf.format(new Date(cal2.getTimeInMillis()))); // 1997-04-28
//		System.out.println("\n");
//		LocalDate ld = LocalDate.parse("2024-06-13");
//		System.out.println(ld);
//
//		System.out.println(ld.withDayOfMonth(1).getDayOfWeek());
//		
//		int startDay = cal.get(DAY_OF_MONTH);
////		int startDay = ld.withDayOfMonth(1).getDayOfWeek().getValue();	
//		System.out.println(startDay);

//		System.out.println("\n");
//		
//				
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date())); // 1997-04-28
		
		Calendar cal = Calendar.getInstance();//start
		Calendar cal2 = Calendar.getInstance();//end
		
		cal.add(5, 1-cal.get(DAY_OF_MONTH));
		
		cal2.add(cal2.get(DAY_OF_WEEK), 30);
		cal2.add(5, -cal2.get(DAY_OF_MONTH)); // end
		
		
		int startDay = cal.get(DAY_OF_MONTH);
		int endDay = cal2.get(DAY_OF_MONTH);
		
		
		int cnt = 0;
		
		System.out.printf("%2s %1s %1s %1s %1s %1s %1s","일","월","화","수","목","금","토");
		System.out.println();
//		
		for (int i = 1 - startDay; i <= endDay; i++) {
			
			if (i > 0) {
				System.out.printf("%3d",i);	
			}else {
				System.out.printf("%3c",' ');
			}
			
			if (cnt % 7 == 0) {
				System.out.println();
			}
				
			cnt++;
			
		}
	}
	
	static void URL() {
		String str = "https://search.naver.com/search.naver?"
				+ "sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC&oquery=rkskekfk&tqi=iXn%2FWsqpts0ssE0efBossssssEd-375385";
		// 1. 프로토콜 		https
		// 2. 도메인 		search.naver.com
		// 3. 파일 네임
		// 4. 쿼리스트링 	sm=tab_hty.top 
		//					&where=nexearch
		//					&ssc=tab.nx.all 
		//					&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC 
		//					&oquery=rkskekfk
		//					&tqi=iXn%2FWsqpts0ssE0efBossssssEd-375385
		// 
		//		현재 위의 문자열은 5쌍의 key, vlaue
		
		String[] arr = str.split("/");
		System.out.println("프로토콜 : " + arr[0].substring(0,arr[0].indexOf(':')));
		
		System.out.println("도메인 : " + arr[2]);
		System.out.println("파일네임 : " + arr[3].substring(0,arr[3].indexOf('?')));
		
		String[] arr1 = str.split("\\?");		
		arr = arr1[1].split("&");
		System.out.println(Arrays.toString(arr));
		for (String kv : arr) {
			String[] kvArr = kv.split("=");
			System.out.print("key = " + kvArr[0]);
			System.out.println(", value = " + kvArr[1]);
		}
		
		
	}
}
