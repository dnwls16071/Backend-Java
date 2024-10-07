package adv1.thread;

public class DaemonThreadMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main 쓰레드 실행");

		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(true);	// 데몬 쓰레드 여부
		daemonThread.start();

		System.out.println(Thread.currentThread().getName() + ": Main 쓰레드 종료");
	}

	static class DaemonThread extends Thread {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ": 데몬 쓰레드 실행");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(Thread.currentThread().getName() + ": 데몬 쓰레드 종료");
		}
	}
}
