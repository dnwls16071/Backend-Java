package list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items = new ArrayList<>();

	public void addItems(Item item) {
		items.add(item);
	}

	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		int total = 0;
		for (Item item : items) {
			total += item.getTotalPrice();
			System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
		}
		System.out.println("전체 가격 합: " + total);
	}
}
