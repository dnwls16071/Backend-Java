package generic2;

public class WildCardMain {
	public static void main(String[] args) {
		Box<Object> objectBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		dogBox.setValue(new Dog("멍멍이", 100));

		WildCardMethod.printGenericV1(dogBox);
		WildCardMethod.printWildCardMethodV1(dogBox);

		WildCardMethod.printGenericV2(dogBox);
		WildCardMethod.printWildCardMethodV2(dogBox);

		Dog dog = WildCardMethod.printAndReturn(dogBox);
		Animal animal = WildCardMethod.printAndreturn(dogBox);
	}
}
