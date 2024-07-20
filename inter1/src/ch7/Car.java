package ch7;

public class Car {
	private String model;
	private int chargeLevel;
	private Engine engine;

	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new Engine(this);
	}

	public String getModel() {
		return model;
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void start() {
		engine.start();
		System.out.println(model + " 시작 완료");
	}
}
