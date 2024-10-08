package adv1.thread.interrupt;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class ThreadStopMain {
	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		Thread thread = new Thread(myTask, "work");
		thread.start();
		
		sleep(1000);
		log("작업 중단 지시");
		thread.interrupt();
		log("work 쓰레드 인터럽트 상태1 : " + thread.isInterrupted());
	}

	static class MyTask implements Runnable {

		@Override
		public void run() {
			// 인터럽트 상태를 변경
			while (!Thread.interrupted()) {
				log("작업 중");
			}
			log("work 쓰레드 인터럽트 상태2 : " + Thread.currentThread().isInterrupted());
			log("자원 정리");
			log("작업 종료");
		}
	}
}
