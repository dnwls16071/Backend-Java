package ch9;

public class Item {
	private String name;
	private int price;

	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void print() {
		System.out.println("이름: " + name + ", 가격: " + price);
	}

	public int getPrice() {
		return price;
	}
}
