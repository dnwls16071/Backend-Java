package adv1.thread;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class JoinMainV0 {
	public static void main(String[] args) {
		log("start");

		Thread thread1 = new Thread(new Job(), "thread1");
		Thread thread2 = new Thread(new Job(), "thread2");

		thread1.start();
		thread2.start();
		log("end");
	}

	static class Job implements Runnable {

		@Override
		public void run() {
			log("작업 시작");
			sleep(1000);
			log("작업 완료");
		}
	}
}
