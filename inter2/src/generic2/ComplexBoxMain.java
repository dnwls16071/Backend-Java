package generic2;

public class ComplexBoxMain {
	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("야옹이", 50);

		ComplexBox<Dog> hospital = new ComplexBox<>();
		hospital.setAnimal(dog);

		Cat result = hospital.printAndReturn(cat);
		System.out.println("result = " + result);
	}
}
