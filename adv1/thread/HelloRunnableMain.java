package adv1.thread;

public class HelloRunnableMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": start");

		HelloRunnable hello = new HelloRunnable();
		Thread thread = new Thread(hello);
		thread.start();

		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
