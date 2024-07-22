package generic2;

public class WildCardMethod {
	static <T> void printGenericV1(Box<T> box) {
		System.out.println("T = " + box.getValue());
	}

	static void printWildCardMethodV1(Box<?> box) {
		System.out.println("? = " + box.getValue());
	}

	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.getValue();
		System.out.println("동물 이름: " + t.getName());
		System.out.println("동물 크기: " + t.getSize());
	}

	static void printWildCardMethodV2(Box<? extends Animal> box) {
		Animal animal = box.getValue();
		System.out.println("동물 이름: " + animal.getName());
		System.out.println("동물 크기: " + animal.getSize());
	}

	static <T extends Animal> T printAndReturn(Box<T> box) {
		T t = box.getValue();
		System.out.println("이름: " + t.getName());
		return t;
	}

	static Animal printAndreturn(Box<? extends Animal> box) {
		Animal animal = box.getValue();
		System.out.println("이름: " + animal.getName());
		return animal;
	}
}
