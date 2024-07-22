package list;

public class BatchProcessor {

	private final MyList<Integer> myList;

	public BatchProcessor(MyList<Integer> myList) {
		this.myList = myList;
	}

	public void logic(int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			myList.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
	}
}
