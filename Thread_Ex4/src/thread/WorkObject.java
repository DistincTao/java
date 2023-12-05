package thread;

public class WorkObject {
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodA 작업");
		
		notify(); // 다른 thread를 실행 대기 상태로 만듬
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업");
		
		notify(); // 다른 thread를 실행 대기 상태로 만듬
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
