package lesson13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.put("C", 2);
		map.put("D", 2);
		System.out.println(map);
		System.out.println(map.get("F"));
		System.out.println(map.get("D"));
		System.out.println(map.size());
		
		// 탐색
		// 1번째
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> en : entry ) {
			System.out.println(en.getKey() + " ::: " + en.getValue());
		}
		// 2번째
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " ::: " + map.get(key));
		}
		
		
		Collection<Integer> collection = map.values();
		System.out.println(collection);
		List<Integer> list = new ArrayList<Integer>(collection);
		Set<Integer> set = new HashSet<Integer>(collection);
		
		System.out.println(list);
		System.out.println(set);
	}
}
