package ch12;

public class NaverPay implements Pay {
	@Override
	public boolean processPay(int amount) {
		System.out.println("네이버 페이 시스템과 연결합니다.");
		System.out.println(amount + "결제를 시도합니다.");
		return true;
	}
}
