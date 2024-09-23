package lesson16_stream;

import java.util.*;
import java.util.stream.*;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,42,41,2,3,4,4,5,5,1,23,1,24);
		
		List<String> list =
		stream
		.distinct()
		.sorted((a,b) -> a -b)
//		.map(i -> i.toString())
		.map(i -> i+"")
		.collect(Collectors.toList())
//		.forEach(System.out::println)
		;
//		System.out.println(list);
		
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println);
	}
}
