package generic2;

public class WildCardMain2 {
	public static void main(String[] args) {
		Box<Object> objectBox = new Box<>();
		Box<Animal> animalBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		Box<Dog> dogBox = new Box<>();

		writeBox(objectBox);
		writeBox(animalBox);
		
		// 하한이 Animal이므로 Cat, Dog는 타입으로 들어올 수 없음
		// writeBox(catBox); 
		// writeBox(dogBox);

		Animal animal = animalBox.getValue();
		System.out.println("animal = " + animal);
	}

	static void writeBox(Box<? super Animal> box) {
		box.setValue(new Dog("멍멍이", 100));
	}
}
