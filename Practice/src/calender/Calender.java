package calender;

import static java.util.Calendar.DAY_OF_WEEK;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static calender.CommonUtils.*;

public class Calender {
	public static void main(String[] args) {
		// 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
		Calendar();
		
		// URL 분석 (String Class 사용)
//		URL();
		
	
	}
	static void Calendar() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Calendar cal = Calendar.getInstance();

		int year = cal.get(cal.YEAR);
        int month = cal.get(cal.MONTH); 
        int day = cal.get(cal.DAY_OF_MONTH);

		while(true){	
			int input = nextInt("1.이전달  2.다음달  3.이전해  4.다음해  5.특정 연월  6.종료");
			if(input == 6) break;
			switch (input) {
				case 1:
					cal.set(cal.MONTH, month - 1); 		
					break;
				case 2:
					cal.set(cal.MONTH, month + 1);
					break;
				case 3:
					cal.set(cal.YEAR, year - 1);
					break;
				case 4:
					cal.set(cal.YEAR, year + 1);
					break;
				case 5:
					try{
						Date date= sdf.parse(nextLine("달입력 yyyy-mm-dd"));
						cal.setTime(date);
					}catch (Exception e){
						System.out.println("양식에 맞게 작성해주세요.");
						continue;
					}
					break;
				default:
					break;
			}

			year = cal.get(cal.YEAR);
			month = cal.get(cal.MONTH); 
			day = cal.get(cal.DAY_OF_MONTH);

			int startDay = startDay(cal,day);
			int endDay 	 = endDay(cal,month+1);

			System.out.printf("%11d-%d-%d\n",year,month,day);
			CalendarView(startDay,endDay);
		}
	}
	// 해당 월 1일 위치 찾기
	static int startDay(Calendar cal,int day) {
		cal.add(cal.DAY_OF_MONTH, 1 - day);
		return cal.get(DAY_OF_WEEK);
	}
	// 해당 월 마지막날 찾기
	static int endDay(Calendar cal,int month) {
		cal.set(cal.MONTH, month - 1); 
		return cal.getActualMaximum(cal.DAY_OF_MONTH);
	}
	// 달력 표출
	static void CalendarView(int startDay, int endDay) {
		int cnt = 0;
		System.out.printf("%2s %1s %1s %1s %1s %1s %1s","일","월","화","수","목","금","토");
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
		System.out.println("\n");
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
