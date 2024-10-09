package adv1.sync;

import java.util.concurrent.locks.LockSupport;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class LockSupportMainV2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ParkTest(), "thread1");
		thread1.start();

		sleep(1000);	// main 쓰레드를 1초간 대기
		log("thread1 상태 : " + thread1.getState());

		// LockSupport.unpark(thread1);
		thread1.interrupt();
	}

	static class ParkTest implements Runnable {

		@Override
		public void run() {
			log("park 시작");
			LockSupport.park();
			log("park 종료, state : " + Thread.currentThread().getState());
			log("인터럽트 상태 : " + Thread.currentThread().isInterrupted());
		}
	}
}
