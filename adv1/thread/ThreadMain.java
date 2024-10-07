package thread;

public class ThreadMain {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " : start");	// Main 쓰레드

		HelloThread thread1 = new HelloThread();							// HelloThread 쓰레드
		thread1.start();

		System.out.println(Thread.currentThread().getName() + " : end");	// Main 쓰레드
	}
}
