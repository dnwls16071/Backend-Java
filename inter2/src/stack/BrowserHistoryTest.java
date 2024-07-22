package stack;

public class BrowserHistoryTest {
	public static void main(String[] args) {
		BrowerHistory browerHistory = new BrowerHistory();
		browerHistory.visitPage("youtube.com");
		browerHistory.visitPage("google.com");
		browerHistory.visitPage("facebook.com");

		String currentPage1 = browerHistory.goBack();
		System.out.println("currentPage1 = " + currentPage1);

		String currentPage2 = browerHistory.goBack();
		System.out.println("currentPage2 = " + currentPage2);
	}
}
