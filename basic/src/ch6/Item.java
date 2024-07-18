package ch6;

public class Item {
	private String name;
	private int price;
	private int quantity;

	Item(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getTotalAmount() {
		return price * quantity;
	}
}
