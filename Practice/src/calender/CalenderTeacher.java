package calender;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class CalenderTeacher {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//		url();
		calendar();
	}
	
	
	static void url() {
		String str = "https://search.naver.com/search.naver?"
				+ "sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC&oquery=rkskekfk&tqi=iXn%2FWsqpts0ssE0efBossssssEd-375385";
		
		try {
			URL url = new URL(str);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("\n");
		MyUrl myurl = new MyUrl(str);
		System.out.println(myurl);
		myurl.print();
		
	}
	static void calendar() {
		
		Calendar cal = Calendar.getInstance(); 	// 2024-09-19
		
		cal.add(Calendar.MONTH, 1);
		
		// 연, 월, 마지막 날짜, 1일의 요일
		int year = cal.get(Calendar.YEAR); 		// 2024
		int month = cal.get(Calendar.MONTH);  	// 8 
		
		System.out.println(year);
		System.out.println(month);
		printCal(cal);
		while(true) {
			System.out.println("1.이전달  2.다음달  3.이전해  4.다음해  5.특정 연월  6.종료");
			switch (scanner.nextInt()) {
			case 1: 
				cal.add(Calendar.MONTH,-1);
				break;
			case 2: 
				cal.add(Calendar.MONTH,+1);
				break;
			case 3: 
				cal.add(Calendar.YEAR,-1);
				break;
			case 4: 
				cal.add(Calendar.YEAR,+1);
				break;
			case 5:
//				System.out.println("연도 입력 > ");
//				cal.add(Calendar.YEAR, scanner.nextInt());				
//				System.out.println("월 입력 > ");
//				cal.add(Calendar.YEAR, scanner.nextInt());
				System.out.println("연도, 월을 입력해주세요. ex) 2024/09");
				String str = scanner.nextLine();
				try {
					cal.setTime(new SimpleDateFormat("yyyy/MM").parse(str));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
			printCal(cal);
			
		}
		
	}
	
	static void printCal(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH)+1));
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, 1);				// 1일로 초기화
		int startDate = cal.get(Calendar.DAY_OF_WEEK); // 1 : 일요일
		
		for(int i = 1 - startDate +1; i <= lastDate; i++) {
			if (i > 0) {
				System.out.printf("%4d",i);				
			}else {
				System.out.print("    ");
			}
			if(i % 7 == startDate) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
}
class MyUrl{
	String protocol;
	String domain;
	String filename = "";
	String[] queryStrings;
	
	public MyUrl(String str) {
		// protocol
		protocol = str.substring(0,str.indexOf("://"));
		
		// domain
		str = str.substring(str.indexOf("://")+3);
		int idx = str.indexOf("/");
		if (idx < 0) {
			domain = str;
			return;
		}
		domain = str.substring(0,idx);
		
		// filename
		str = str.substring(idx+1);
		idx = str.indexOf("?");
		if (idx < 0) {
			filename = str;
			return;
		}
		filename = str.substring(0,idx);
		
		// queryStrings
		str = str.substring(idx+1);
		if(str.length() == 0) return;
		queryStrings = str.split("&");
	}
	
	@Override
	public String toString() {
		return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", filename=" + filename + ", queryStrings="
				+ Arrays.toString(queryStrings) + "]";
	}
	
	public void print() {
		System.out.println("[protocol=" + protocol + ", domain=" + domain + ", filename=" + filename);
		for(String i : queryStrings) {
			String[] tmp = i.split("=");
			System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp[1] : ""));
		}
	}
	
}
