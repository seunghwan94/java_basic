package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		String what = stack.push("test");
		stack.push("test2");
		System.out.println(what);
		stack.push("test3");
		stack.push("test4");
		System.out.println(stack.size());
		stack.push("test5");
		System.out.println(stack.pop());
		stack.push("test6");
		stack.push("test7");
		System.out.println(stack.size());
		
		System.out.println(stack);
		System.out.println(stack.pop());
	

		

	}
}
