package adv1.memory;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class VolatileCountMain {
	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		Thread thread = new Thread(myTask);
		thread.start();

		sleep(1000);

		myTask.flag = false;
		log("flag = " + myTask.flag + ", count = " + myTask.count + " in main");
	}

	static class MyTask implements Runnable {

		volatile boolean flag = true;
		volatile long count;

		@Override
		public void run() {
			while (flag) {
				count++;
				if (count % 10000000 == 0) {
					log("flag = " + flag + ", count = " + count);
				}
			}
			log("flag = " + flag + ", count = " + count + " 종료");
		}
	}
}
