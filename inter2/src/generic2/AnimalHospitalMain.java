package generic2;

public class AnimalHospitalMain {
	public static void main(String[] args) {
		AnimalHospital<Dog> dogHospital = new AnimalHospital<>();
		AnimalHospital<Cat> catHospital = new AnimalHospital<>();

		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("야옹이", 200);

		dogHospital.setAnimal(dog);
		dogHospital.checkup();

		catHospital.setAnimal(cat);
		catHospital.checkup();

		Dog resultDog = dogHospital.getBigger(new Dog("멍멍이2", 500));
		Cat resultCat = catHospital.getBigger(new Cat("야옹이2", 500));

		System.out.println("resultDog = " + resultDog);
		System.out.println("resultCat = " + resultCat);
	}
}
