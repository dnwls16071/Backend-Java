package ch8;

public class Library {
	private int size;
	private Book[] books;

	public Library(int size) {
		books = new Book[size];
		size = 0;
	}

	public void addBook(String title, String author) {
		if (books.length > size) {
			books[size++] = new Book(title, author);
		} else {
			System.out.println("도서관 저장 공간이 부족합니다.");
		}
	}

	public void showBooks() {
		System.out.println("== 책 목록 출력 ==");
		for (int i = 0; i < size; i++) {
			System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
		}
	}

	private class Book {
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}
}
