package thread;

import static util.Logger.log;

public class InnerRunnableMainV1 {
	public static void main(String[] args) {
		log("main() start");

		Runnable runnable = new InnerRunnable();
		Thread thread = new Thread(runnable);
		thread.start();

		log("main() end");
	}

	static class InnerRunnable implements Runnable {

		@Override
		public void run() {
			log("run()");
		}
	}
}
