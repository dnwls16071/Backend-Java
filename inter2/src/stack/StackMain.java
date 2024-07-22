package stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);

		// 꺼내지 않고 단순 조회만
		Integer i = stack.peek();
		System.out.println(i);

		// 스택 요소 뽑기
		Integer pop1 = stack.pop();
		System.out.println(pop1);
		Integer pop2 = stack.pop();
		System.out.println(pop2);
		Integer pop3 = stack.pop();
		System.out.println(pop3);
	}
}
