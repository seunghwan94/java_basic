package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	
	private int[] items = new int[3];
	private int cnt;
	
	int pop() {
		int rlt = items[--cnt];
		items[cnt] = 0;
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
		System.out.println(Arrays.toString(items));
		return cnt;
	}
	String read(){
		items = Arrays.copyOf(items, cnt);
		return Arrays.toString(items);
	}
	
}
