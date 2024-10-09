package adv1.sync.ex;

import static adv1.util.Logger.log;

public class SyncTest2Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Runnable task = new Runnable() {
			@Override
			public void run() {
				counter.count();
			}
		};

		Thread thread1 = new Thread(task, "thread1");
		Thread thread2 = new Thread(task, "thread2");

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}

	static class Counter {

		// 지역 변수는 스택 영역에 저장된다. 해당 영역의 공유 개별 공간이므로 다른 쓰레드와 공유되지 않는다.
		// 프로세스 메모리 구성에서 코드, 데이터, 힙 영역 등이 쓰레드와 공유되고 스택의 경우 개별 저장 공간을 가진다.
		// 따라서 지역 변수는 동기화에 대한 걱정을 하지 않아도 된다.
		public void count() {
			int localValue = 0;
			for (int i = 0; i < 10000; i++) {
				localValue++;
			}
			log("결과 확인 : " + localValue);
		}
	}
}
