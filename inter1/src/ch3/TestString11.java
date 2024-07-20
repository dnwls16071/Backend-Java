package ch3;

public class TestString11 {
	public static void main(String[] args) {
		String str = "Hello Java";
		// reverse() : 뒤집기
		// 반환 타입이 같은 StringBuilder이기 때문에 메서드 체이닝 적용
		// toString() : StringBuilder → String(불변 → 가변)으로 전환
		String result = new StringBuilder(str).reverse().toString();
		System.out.println(result);
	}
}
