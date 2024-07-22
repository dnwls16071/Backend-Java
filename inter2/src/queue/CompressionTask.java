package queue;

public class CompressionTask implements Task{
	@Override
	public void execute() {
		System.out.println("데이터 압축...");
	}
}
