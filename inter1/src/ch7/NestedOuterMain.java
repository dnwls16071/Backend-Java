package ch7;

public class NestedOuterMain {
	public static void main(String[] args) {
		NestedOuter nestedOuter = new NestedOuter();
		NestedOuter.Nested nested = new NestedOuter.Nested();

		nested.print();
	}
}
