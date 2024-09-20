package lesson15_lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		// 람다식이 없었을 때 기존 사용 방법 (익명함수 사용)
//		MyInter<Integer> inter = new MyInter<>() {
//			@Override
//			public Integer m(Integer t) {
//				return t * t;
//			}
//		};
//		System.out.println(inter.m(10));
		// 람다식 생성 이후
		MyInter<Integer> inter = t -> t * t;
		System.out.println(inter.m(10));
		
		MyInter<String> inter2 = s -> "hello"+s;
		System.out.println(inter2.m("새똥이"));
		
		Function<String, Integer> f =s ->Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt;
		
		int result = f.apply("1234");
		System.out.println(result+ 1000);
		
		Object o = new MyInter<Integer>() {
			@Override
			public Integer m(Integer t) {
				return t;
			}
			
		};
		// 타입이 선언되지 못해서 사용이 불가능하다
//		Object o2 = s -> s;
		// 타입을 선언함으로써 추론이 가능하기 때문에 가능
		Object o2 = (MyInter<String>)(s -> s);
		
	}
}

// funcionalinterface는 무조건 추상 하나만 가능
// default는 구상 메서드이기 때문 몇개를 하든 상관 없다.
// 파라미터 갯수가 한개이여야한다.
@FunctionalInterface
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	}

}