package lesson13_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> Link = new LinkedList<Integer>();
		
		incre1(arr);
		incre2(arr);
		access(arr);
		remove1(arr);
		remove2(arr);
		
	}
	static void incre1(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < 1_000_000; i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));		
	}
	static void incre2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < 1_000; i++) {
			list.add(0,i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));		
	}
	static void access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.get(i);
		}
	}
	static void remove1(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.remove(i-1);
		}
	}
	static void remove2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.remove(i-1);
		}
	}
	
}
