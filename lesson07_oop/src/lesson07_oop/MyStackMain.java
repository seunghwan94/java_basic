package lesson07_oop;

public class MyStackMain {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		
		System.out.println(myStack.push(7));
		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		System.out.println(myStack.size());
		System.out.println(myStack.read());
//		myStack.items[0];
		
	}
}
