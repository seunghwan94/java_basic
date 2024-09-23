package lesson17_thread;

public class ThreadEx {
	public static void main(String[] args) {

		Thread t1 = new ThreadExtend();
		t1.setPriority(6);
		t1.start();
		new Thread(new RunnableImpl(), "test").start();
			
		
		
		System.out.println("main 종료" + Thread.currentThread());
	}
}
class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 상속");
		for(int i = 0; i < 50; i++) {
			System.out.println("Thread 상속" + i + currentThread().getName());
		}
	}
	
}
class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable 구현");
		for(int i = 0; i < 50; i++) {
			System.out.println("Runnable 구현" + i + Thread.currentThread().getName());
		}
	}
	
}

