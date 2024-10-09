package adv1.sync.ex;

import static adv1.util.Logger.log;

public class SyncTest1Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Runnable task = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					counter.increment();
				}
			}
		};

		Thread thread1 = new Thread(task, "thread1");
		Thread thread2 = new Thread(task, "thread2");

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		log("결과 확인 : " + counter.getCount());
	}

	static class Counter {
		private int count = 0;

		public void increment() {
			synchronized (this) {
				count++;
			}
		}

		public int getCount() {
			return count;
		}
	}
}
