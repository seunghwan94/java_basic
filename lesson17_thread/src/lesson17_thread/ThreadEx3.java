package lesson17_thread;

public class ThreadEx3 {
	public static void main(String[] args) throws InterruptedException {
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.sum + t2.sum);
	}
}

class Sum extends Thread {
	int sum;
	public void run() {
		for(int i = 1; i < 1000; i++) {
			sum += i;
		}
	}
}