package generic2;

public class GenericMethod {
	public static Object objMethod(Object obj) {
		System.out.println("object.print = " + obj);
		return obj;
	}

	// 제네릭 메서드 : static 메서드(<T> T method(T t))
	public static <T> T generateMethod1(T t) {
		System.out.println("generic.print = " + t);
		return t;
	}

	// 타입 매개변수 제한 적용한 제네릭 메서드
	public static <T extends Number> T generateMethod2(T t) {
		System.out.println("bound.print = " + t);
		return t;
	}

	// 제네릭 메서드 : 인스턴스 메서드
	public <T> T instanceMethod(T t) {
		System.out.println("t.instanceMethod = " + t);
		return t;
	}
}
