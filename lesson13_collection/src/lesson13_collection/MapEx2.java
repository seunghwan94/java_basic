package lesson13_collection;

import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {
	public static void main(String[] args) {
		// 글자 빈도 수 구하기
		String str = "AAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBXXXXXXXXXXXXXXXXXXX";
		
		
		
		// 목표 
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put(str.charAt(0)+"", 1);
//		map.put(str.charAt(0)+"", );
		
		String[] strs = str.split("");
		for (String s : strs) {
			map.put(s,map.containsKey(s)? map.get(s)+1 : 1);
		}
		System.out.println(map);
		
	}
}
