package lesson07_oop;

public class MyQMain {
	public static void main(String[] args) {
		MyQ myQ = new MyQ();
		
		myQ.push(10);
		myQ.push(20);
		myQ.push(30);
		System.out.println(myQ.push(7));
		System.out.println(myQ.size());
		System.out.println("=================");
		System.out.println(myQ.pop());
		System.out.println(myQ.pop());
		System.out.println(myQ.pop());
		System.out.println(myQ.pop());
		System.out.println("=================");
		System.out.println(myQ.size());
//		myStack.items[0];
	}
	
	
}
