package calender;

public class Calender {
	public static void main(String[] args) {
		// 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
		
		// URL 분석 (String Class 사용)
		
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
		String str1 = str.substring(0,str.indexOf('?'));
		System.out.println(str1);
		String str2 = str1.substring(0, str1.indexOf(':'));
		System.out.println("프로토콜 : " + str2);
		String str3 = str1.substring(str1.indexOf('/', 2));
		System.out.println("프로토콜 : " + str3);
		
		
//		System.out.println(str.substring(str.indexOf("//")));
////		String str2 = str.substring(str.indexOf("//"),str.substring(str.indexOf("//")).indexOf("/"));
////		System.out.println(str2);
//		
	}
}
