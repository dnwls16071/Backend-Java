package generic2;

public class AnimalHospital<T extends Animal> {
	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

	public void checkup() {
		System.out.println("동물 이름: " + animal.getName());
		System.out.println("동물 크기: " + animal.getSize());
		animal.sound();
	}

	public T getBigger(T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
