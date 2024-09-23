package lesson17_thread;

public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt = new Counter();
//		cnt.incre();
//		System.out.println(cnt.i);
		T t1 = new T(cnt);
		T t2 = new T(cnt);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(cnt.i);
 
	}
}

class Counter {
	int i;
//	synchronized void incre() { // 동기화
	void incre() { 
		synchronized (this){ // 2번째 방법
			for(int i = 0; i < 100000; i++) {
				this.i++;
			}
		}
		
//	}
	}
}

class T extends Thread {
	Counter c;
	T(Counter c){
		this.c = c;
	}
	@Override
	public void run() {
		c.incre();
	}
}