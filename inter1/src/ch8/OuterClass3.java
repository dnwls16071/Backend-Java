package ch8;

public class OuterClass3 {

	public void myMethod() {

		class LocalClass {

			void hello() {
				System.out.println("LocalClass.hello");
			}

		}

		LocalClass localClass = new LocalClass();
		localClass.hello();
	}
}
