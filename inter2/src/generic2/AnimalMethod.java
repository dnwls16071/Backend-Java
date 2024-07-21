package generic2;

public class AnimalMethod {
	public static <T extends Animal> void checkup(T t) {
		System.out.println("동물 이름: " + t.getName());
		System.out.println("동물 크기: " + t.getSize());
	}

	public static <T extends Animal> T getBigger(T animal, T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}


}
