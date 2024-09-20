package lesson13_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.offerFirst(1);
		deque.offerFirst(2);
		deque.offerFirst(3);
		
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		
		
	}
}
