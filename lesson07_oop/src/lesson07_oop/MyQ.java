package lesson07_oop;

import java.util.Arrays;

public class MyQ {
	private int[] items = new int[3];
	private int cnt;
	private int begin;
	
	int pop() {
		begin++;
		int rlt = items[cnt-begin];
		
		return rlt;
	}
	int push(int item) {
		if(items.length == cnt) {
			items = Arrays.copyOf(items, items.length*2);
		}
		items[cnt++] = item;
		return item;
	}
	int size() {
//		System.out.println(Arrays.toString(items));
		return cnt-begin;
	}
}
