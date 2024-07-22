package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowerHistory {
	private Deque<String> browser = new ArrayDeque<>();
	private String currentPage = null;

	public void visitPage(String page) {
		if (currentPage != null) {
			browser.push(currentPage);
		}
		currentPage = page;
		System.out.println("방문: " + page);
	}

	public String goBack() {
		if (!browser.isEmpty()) {
			currentPage = browser.pop();
			System.out.println("뒤로 가기: " + currentPage);
			return currentPage;
		}
		return null;
	}
}
