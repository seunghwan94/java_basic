package lesson16_stream;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);
		
		List<Integer> list = IntStream.range(1, 45).mapToObj(s -> s).collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0,6));
		
		LongStream ls = new Random().longs(6,1,46).sorted();
		ls.forEach(System.out::println);
		
		is = "가나다라ABCD".chars();
		is.forEach(s -> System.out.println((char)s));
	}
}
