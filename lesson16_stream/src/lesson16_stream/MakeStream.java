package lesson16_stream;


import java.util.*;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		// Stream은 한번 사용하면 다시 만들어서 사용해야된다.

		//배열로 스트림 만들기
		String[] strs = {"가","나", "A","B"};
		Stream<String> stream = Arrays.stream(strs);
		stream.forEach(System.out::println);
		
		// List로 스트림 만들기
		List<String> list =new ArrayList<String>(Arrays.asList(strs));
		stream = list.stream();
		stream.forEach(System.out::println);
		
		// Set으로 스트림 만들기
		stream = new HashSet<>(list).stream();
		stream.forEach(System.out::println);
		
		// 빌더 패턴으로 스트림 만들기
		stream = Stream.builder()
			.add("새똥이")
			.add("개똥이")
			.add("소똥이")
			.build()
			.map(o->o.toString());		
		stream.forEach(System.out::println);
		
		// generate 이용하여 스트림 만들기
		stream = Stream.generate(() -> "애국가").limit(10);
		stream.forEach(System.out::println);
		
		// iterate 사용하여 스트림 만들기
		stream = Stream.iterate("A", s -> (char)(s.charAt(0)+1) + "").limit(26);
		stream.forEach(System.out::println);
		
		// of 사용으로 스트림 만들기
		stream = Stream.of("가","새똥이","개똥이");
		stream.forEach(System.out::println);
	}
}
