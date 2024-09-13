package lesson12_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		// b로 시작하는 영어단어 (소문자)
		Pattern p = Pattern.compile("b[a-z]*");  // 0개 이상
		Pattern p1 = Pattern.compile("b[a-z]+"); // 1개 이상
		Pattern p2 = Pattern.compile("b[a-z]");  // 2자리
		Matcher m; // ?
		
		m = p.matcher("bat");
		System.out.println(m.matches());

		m = p.matcher("cat");
		System.out.println(m.matches());
		
		m = p.matcher("bed");
		System.out.println(m.matches());
		
		System.out.println("bat".matches("b[a-z]*"));
		
	}
}
