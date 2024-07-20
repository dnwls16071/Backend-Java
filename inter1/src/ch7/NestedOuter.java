package ch7;

public class NestedOuter {
	private static int outClassValue = 1;
	private int outInstanceValue = 2;

	static class Nested {
		private int nestedInstanceValue = 3;

		public void print() {
			// 정적 중첩 클래스 멤버에 접근
			System.out.println(nestedInstanceValue);
			// 외부 클래스 인스턴스 변수에 접근X
			// System.out.println(outInstanceValue);
			// 외부 클래스 정적 변수에 접근
			System.out.println(NestedOuter.outClassValue);
		}
	}
}
