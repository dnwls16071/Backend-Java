package queue;

public class SchedulerTest {
	public static void main(String[] args) {
		TaskScheduler taskScheduler = new TaskScheduler();
		taskScheduler.addTask(new CompressionTask());
		taskScheduler.addTask(new BackupTask());
		taskScheduler.addTask(new CleanTask());

		System.out.println("작업 시작");
		run(taskScheduler);
		System.out.println("작업 완료");
	}

	private static void run(TaskScheduler taskScheduler) {
		while (taskScheduler.getRemainingTasks() > 0) {
			taskScheduler.processNextTask();
		}
	}
}
