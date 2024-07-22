package list;

public class BatchProcessorMain {
	public static void main(String[] args) {
		MyList<Integer> myIntegerList1 = new MyArrayList<>();
		MyList<Integer> myIntegerList2 = new MyLinkedList<>();

		int size = 50000;

		// 대량의 데이터를 처리하는 배치 프로세스 : 현재 맨 뒤에 추가되는 형식
		BatchProcessor batchProcessor1 = new BatchProcessor(myIntegerList1);
		BatchProcessor batchProcessor2 = new BatchProcessor(myIntegerList2);

		batchProcessor1.logic(size);
		batchProcessor2.logic(size);
	}
}
