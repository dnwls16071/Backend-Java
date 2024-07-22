package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue);

		// 꺼내지 않고 단순 조회만
		Integer i = queue.peek();
		System.out.println(i);

		// 데이터 꺼내기
		Integer poll1 = queue.poll();
		System.out.println(poll1);
		Integer poll2 = queue.poll();
		System.out.println(poll2);
		Integer poll3 = queue.poll();
		System.out.println(poll3);
	}
}
