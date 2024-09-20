package lesson16_stream;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
		Stream<String> stream =  Stream.of("홍길동","이순신","김유신","홍길동","유관순","이순신");
		
		stream
		.distinct() // 중복 제거 (중간연산)
		.filter(s -> s.startsWith("홍")) // 필터 (중간연산)
		.forEach(System.out::println); // 최종연산
	
		// 람다식 참조 변수
		IntBinaryOperator ibo = (x, y) -> Math.max(x, y);
		IntBinaryOperator ibo1 = Math::max;
		
		Function<String, Integer> f = s->Integer.parseInt(s);
		Function<String, Integer> f1 = Integer::parseInt;
		
		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		BinaryOperator<String> bo1 = String::concat;
		
		Function<String, Exception> f2 = s -> new Exception();
		Function<String, Exception> f3 = Exception::new;
		
		
		Comparator<String> com = (x,y) -> y.compareTo(x);
		Comparator<String> com1 = String::compareTo;
	}
	
}
