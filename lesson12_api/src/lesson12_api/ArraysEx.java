package lesson12_api;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		Arrays.sort(arr); // 오름차순
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,(o1,o2) -> -o1.compareTo(o2)); // 내림차순
		System.out.println(Arrays.toString(arr));
		
//		BiFunction<String, String, Integer> bi = (o1,o2) -> -o1.compareTo(o2); 
		
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 5); // 값에 전부 5 값 넣는다 
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = IntStream.range(1, 6).toArray();
		System.out.println(Arrays.toString(arr3));
		
	}
}
