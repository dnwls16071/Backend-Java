package ch8;

public class LocalOuterV1 {
	private int outInstanceValue = 3;

	public void process(int paramVar) {
		int localVar = 1;

		// 지역 클래스
		class LocalPrinter {
			int value = 0;

			// 지역 클래스 접근 범위
			// 자기 자신 + 지역 변수 + 파라미터 + 외부 클래스
			void printData() {
				System.out.println("value="+value);
				System.out.println("localVar="+localVar);
				System.out.println("paramVar="+paramVar);
				System.out.println("outInstanceValue="+outInstanceValue);
			}
		}

		LocalPrinter localPrinter = new LocalPrinter();
		localPrinter.printData();
	}

	public static void main(String[] args) {
		LocalOuterV1 localOuterV1 = new LocalOuterV1();
		localOuterV1.process(2);
	}
}
