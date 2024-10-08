package adv1.memory;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class VolatileFlagMain {
	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		Thread thread = new Thread(myTask, "work");
		log("runFlag = " + myTask.runFlag);
		thread.start();

		sleep(1000);
		myTask.runFlag = false;
		log("runFlag = " + myTask.runFlag);
		log("main 종료");
	}

	static class MyTask implements Runnable {

		volatile boolean runFlag = true;

		@Override
		public void run() {
			log("task 시작");
			while (runFlag) {
				// runFlag가 false로 변하면 무한 반복문을 탈출
			}
			log("task 종료");
		}
	}
}
