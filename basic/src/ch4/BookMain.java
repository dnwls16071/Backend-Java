package ch4;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayInfo();

		Book book2 = new Book("Hello Java", "Seo");
		book2.displayInfo();

		Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
		book3.displayInfo();
	}
}
