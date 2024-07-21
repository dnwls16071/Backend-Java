package generic2;

public class ComplexBox<T extends Animal> {
	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

	public <T> T printAndReturn(T t) {
		System.out.println("animal.className = " + animal.getClass().getName());
		System.out.println("t.className = " + t.getClass().getName());
		return t;
	}
}
