package ch8;

public class LocalOuterV2 {
	private int outInstanceValue = 3;

	public void process(int paramVar) {
		int localVar = 1;

		// 지역 클래스
		// 일반 클래스와 같이 인터페이스를 구현하거나 부모 클래스 상속 가능
		class LocalPrinter implements Printer {
			int value = 0;

			@Override
			public void print() {
				System.out.println("value="+value);
				System.out.println("localVar="+localVar);
				System.out.println("paramVar="+paramVar);
				System.out.println("outInstanceValue="+outInstanceValue);
			}
		}

		LocalPrinter localPrinter = new LocalPrinter();
		localPrinter.print();
	}

	public static void main(String[] args) {
		LocalOuterV2 localOuterV1 = new LocalOuterV2();
		localOuterV1.process(2);
	}
}
