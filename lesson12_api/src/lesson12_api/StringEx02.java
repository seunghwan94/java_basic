package lesson12_api;

public class StringEx02 {
	public static void main(String[] args) {
		String str = "";
		
		
		
		// cache, hash, buffer 성능향상에 목적으로 사용
		StringBuffer sb = new StringBuffer("asdf"); // asdf
		sb.append("g"); // asdfg
		System.out.println(sb);
		
				
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000_000; i++) {
//			str+=i + "0";
//			sb.append("0");
		}
		long end = System.currentTimeMillis();
		System.out.println(str.length() +":::::::"+(end-start) + "ms");
		System.out.println(sb.length() +":::::::"+(end-start) + "ms");
		
		
		str = sb.toString();
		sb = new StringBuffer();
		
		String s = "abcde";
		s = s.substring(0,3) + "123" + s.substring(3);
		System.out.println(s);
		

		sb = new StringBuffer(s);
		sb.insert(3, "1234");
		sb.deleteCharAt(sb.indexOf("c"));
		System.out.println(sb);
		
//		StringBuffer VS StringBuilder
		// StringBuffer : Thread Safe 
		// StringBuilder : Thread Unsafe - 자원 쉐어를 안하기때문에 훨씬 빠르다
		
	}
}
