package ch12;

public class PayService {
	public void processPay(String option, int amount) {
		boolean b;
		System.out.println("결제를 시작합니다: option="+option + ", amount="+amount);
		if (option.equals("kakao")) {
			KaKaoPay kaKaoPay = new KaKaoPay();
			b = kaKaoPay.processPay(amount);
		} else if (option.equals("naver")) {
			NaverPay naverPay = new NaverPay();
			b = naverPay.processPay(amount);
		} else  {
			DefaultPay defaultPay = new DefaultPay();
			b = false;
		}

		if (b) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제 수단이 없습니다.");
			System.out.println("결제에 실패했습니다.");
		}
	}
}
