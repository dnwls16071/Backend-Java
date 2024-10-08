package adv1.thread;

import adv1.util.ThreadUtils;

public class CheckedExceptionMain {
	public static void main(String[] args) {
		throw new RuntimeException();
	}

	static class CheckedRunnable implements Runnable {

		@Override
		public void run() {
			ThreadUtils.sleep(1000);
		}
	}
}
