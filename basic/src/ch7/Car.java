package ch7;

public class Car {
	private String model;
	private static int count;

	public Car(String name) {
		model = name;
		System.out.println("차량 구입, 이름 : " + name);
		count++;
	}

	static void showTotalCars() {
		System.out.println("구매한 차량 수 : " + count);
	}
}
