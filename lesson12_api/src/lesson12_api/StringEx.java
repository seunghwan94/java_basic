package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		
		
		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(100));
		System.out.println(str.equals(new String ("abcdeabcde")));
		System.out.println(str.indexOf("b"));
		System.out.println(str.lastIndexOf("b"));
		System.out.println(str.substring(3,7));
		
		// 첫번째 만나는 c  문자열에서 마지막 만나는 d 문자열까지 자르기
		System.out.println(str.substring(str.indexOf("c"),str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String str1 = "        [   asdf   ]     ";
		System.out.println(str1.trim());
		System.out.println(str1.replaceAll(" ", ""));
		System.out.println(str.startsWith("ab"));
		System.out.println(str.endsWith("ab"));
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));
		
		System.out.println("abc".compareTo("abc")); // abc 1 + 6
		System.out.println("abc".compareTo("aae"));
	}
}
