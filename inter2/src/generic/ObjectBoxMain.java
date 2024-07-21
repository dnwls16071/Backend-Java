package generic;

public class ObjectBoxMain {
	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.setValue(10);
		Integer value = (Integer) integerBox.getValue();
		System.out.println(value);

		ObjectBox stringBox = new ObjectBox();
		stringBox.setValue("hello");
		String value1 = (String) stringBox.getValue();
		System.out.println(value1);

		// 잘못된 타입의 인수 전달
		integerBox.setValue("문자");
		// 에러가 터지는 시점
		Integer value2 = (Integer) integerBox.getValue();
		System.out.println(value2);
	}
}
