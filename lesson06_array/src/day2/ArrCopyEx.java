package day2;

import java.util.Arrays;

public class ArrCopyEx {
	public static void main(String[] args) {
		int[] src = {1,2,3,4};
		int[] dest = new int[src.length * 2];
		
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
		int[] result = Arrays.copyOf(src, 10);
		System.out.println(Arrays.toString(result));
		
		
	}
}
