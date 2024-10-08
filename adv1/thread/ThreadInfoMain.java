package adv1.thread;

import static adv1.util.Logger.log;

public class ThreadInfoMain {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		log("mainThread : " + thread);
		log("mainThread.threadId() : " + thread.threadId());
		log("mainThread.getName() : " + thread.getName());
		log("mainThread.getPriority() : " + thread.getPriority());
		log("mainThread.getThreadGroup() : " + thread.getThreadGroup());
		log("mainThread.getState() : " + thread.getState());
	}
}
