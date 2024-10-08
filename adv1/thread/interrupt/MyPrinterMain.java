package adv1.thread.interrupt;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

import static adv1.util.Logger.log;

public class MyPrinterMain {

	public static void main(String[] args) {
		MyPrinter myPrinter = new MyPrinter();
		Thread thread = new Thread(myPrinter, "printer");
		thread.start();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			log("출력할 문서를 입력하세요(종료 : q): ");
			String s = scanner.nextLine();
			if (s.equalsIgnoreCase("q")) {
				thread.interrupt();
				break;
			}
			myPrinter.addJob(s);
		}
	}

	static class MyPrinter implements Runnable {

		Queue<String> queue = new ConcurrentLinkedDeque<>();

		@Override
		public void run() {
			while (!Thread.interrupted()) {
				if (queue.isEmpty()) {
					Thread.yield();	// 다른 쓰레드에게 양보
					continue;
				}

				try {
					String job = queue.poll();
					log("출력 시작 : " + job + ", 대기 문서 : " + queue);
					Thread.sleep(1000);
					log("출력 완료 : " + job);
				} catch (InterruptedException e) {
					log("인터럽트");
					break;
				}
			}
			log("프린터 종료");
		}

		public void addJob(String job) {
			queue.offer(job);
		}
	}
}
