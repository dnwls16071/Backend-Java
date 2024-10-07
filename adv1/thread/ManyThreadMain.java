package thread;

import static util.Logger.log;

public class ManyThreadMain {
	public static void main(String[] args) {
		log("main() start");

		HelloRunnable hello = new HelloRunnable();

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(hello);
			thread.start();
		}

		log("main() end");
	}
}
