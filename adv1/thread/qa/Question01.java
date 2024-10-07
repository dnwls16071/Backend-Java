package thread.qa;

import static util.Logger.log;

public class Question01 {
	public static void main(String[] args) {
		CounterThread thread = new CounterThread();
		thread.start();
	}

	static class CounterThread extends Thread {

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				log("value: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}