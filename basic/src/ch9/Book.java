package ch9;

public class Book extends Item {
	private String author;
	private String isbn;

	Book(String name, int price, String author, String isbn) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public void print() {
		super.print();	// 부모 클래스의 print() 메서드 호출
		System.out.println("- 저자: " + author + ", ISBN: " + isbn);
	}
}
