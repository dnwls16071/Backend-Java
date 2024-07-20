package ch7;

public class Engine {
	private Car car;

	public Engine(Car car) {
		this.car = car;
	}

	public void start() {
		System.out.println("충전 레벨 확인: " + car.getChargeLevel());
		System.out.println(car.getModel() + "의 엔진을 구동합니다.");
	}
}
