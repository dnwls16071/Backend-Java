package ch6;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemCount;

	void addItem(Item item) {
		if (itemCount > 10) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}
		items[itemCount++] = item;
	}

	/*
	void displayItems() {
		System.out.println("장바구니 상품 출력");
		int sum = 0;
		for (int i = 0; i < itemCount; i++) {
			System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalAmount());
			sum += items[i].getTotalAmount();
		}
		System.out.println("전체 가격 합 : " + sum);
	}
	*/

	// 리팩토링 버전 → 장바구니에 들어있는 상품 출력 & 전체 상품 합계 출력을 분리해야지...
	void displayItems() {
		System.out.println("장바구니 상품 출력");
		for (int i = 0; i < itemCount; i++) {
			System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalAmount());
		}
		System.out.println("전체 가격 합 : " + getTotalAmount());
	}

	private int getTotalAmount() {
		int sum = 0;
		for (int i = 0; i < itemCount; i++) {
			sum += items[i].getTotalAmount();
		}
		return sum;
	}
}
