package adv1.thread;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class JoinMainV1 {
	public static void main(String[] args) throws InterruptedException {
		log("start");

		SumTask task1 = new SumTask(1, 50);
		SumTask task2 = new SumTask(51, 100);
		Thread thread1 = new Thread(task1, "thread1");
		Thread thread2 = new Thread(task2, "thread2");

		thread1.start();
		thread2.start();

		log("join() - main 쓰레드가 thread1, thread2 쓰레드가 종료될 때까지 대기");
		thread1.join(5000);
		thread2.join(5000);
		log("main 쓰레드 대기 완료");

		log("thread1.result = " + task1.result);
		log("thread2.result = " + task2.result);
		int sumAll = task1.result + task2.result;
		log("sumAll = " + sumAll);
		log("end");
	}


	static class SumTask implements Runnable {

		int startValue;
		int endValue;
		int result = 0;

		public SumTask(int startValue, int endValue) {
			this.startValue = startValue;
			this.endValue = endValue;
		}

		@Override
		public void run() {
			log("작업 시작");
			sleep(5000);	// 5초 소요(연산 소요 시간)
			int sum = 0;
			for (int i = startValue; i <= endValue; i++) {
				sum += i;
			}
			result = sum;
			log("작업 완료");
		}
	}
}
