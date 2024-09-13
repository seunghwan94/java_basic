package lesson12_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random1 = new Random(System.currentTimeMillis());
		Random random2 = new Random();
		for (int i = 0; i < 10; i ++) {
			System.out.println(random1.nextInt(6)+1);
		}
		for (int i = 0; i < 10; i ++) {
			System.out.println(random1.nextInt());
			System.out.println(random2.nextInt());
			System.out.println();
		}
	}
}
