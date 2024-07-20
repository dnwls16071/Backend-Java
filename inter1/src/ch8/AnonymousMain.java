package ch8;

public class AnonymousMain {

	public static void main(String[] args) {

		// 익명 클래스 활용
		Hello hello1 = new Hello() {
			@Override
			public void hello() {
				System.out.println("Hello.hello");
			}
		};
		hello1.hello();

		// 람다 리팩토링
		Hello hello2 = () -> System.out.println("Hello.hello");
		hello2.hello();
	}
}
