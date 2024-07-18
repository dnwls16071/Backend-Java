package ch6;

public class MaxCounterMain {
	public static void main(String[] args) {
		MaxCounter counter = new MaxCounter(3);
		counter.increment();	// 1
		counter.increment();	// 2
		counter.increment();	// 3
		counter.increment();	// 4
		int count = counter.getCount();
		System.out.println(count);
	}
}
