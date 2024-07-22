package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

	private Queue<Task> queue = new ArrayDeque<>();

	public void addTask(Task task) {
		queue.offer(task);
	}

	public void processNextTask() {
		Task poll = queue.poll();
		if (poll != null) {
			poll.execute();
		}
	}

	public int getRemainingTasks() {
		return queue.size();
	}
}
