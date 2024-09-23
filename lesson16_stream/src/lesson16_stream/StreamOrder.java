package lesson16_stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOrder {
	public static void main(String[] args) {
		boolean result =
		
		// 스트림 생성
		
		// 연산
		
		// 1. 중간연산
		// 필터, 맵
		Stream.of("홍길동","김유신","이순신","유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)
//		.count()		
		
		// 2. 최종연산
		// forEach, allMatch, anyMatch
//		.forEach(System.out::println)
//		.allMatch(s->s.startsWith("홍")) // 조건에 맞으면 false
		.anyMatch(s->s.startsWith("홍")) // 조건에 맞으면 true
		;
		System.out.println(result);
		
		
		String str = null;
		// null로 넣었을때 여기서 오류가 난다.
		Optional<String> optional1 = Optional.of(str);
		// ofNullable 사용하면 여기서는 오류 안남
		Optional<String> optional2 = Optional.ofNullable(str);

		// null check method
		System.out.println(optional2.isPresent());
		System.out.println(optional2.orElse("대체 문자"));
		// 값이 있으면 출력 / 없으면 null
		optional2.ifPresent(System.out::println); 
//		optional2.ifPresentOrElse(System.out::println,"대체문자"); 
		
	}
}
