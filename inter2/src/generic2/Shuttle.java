package generic2;

public class Shuttle<T extends BioUnit> {
	private T unit;

	public T getUnit() {
		return unit;
	}

	public T out() {
		return unit;
	}

	public void in(T unit) {
		this.unit = unit;
	}

	public void showInfo() {
		System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
	}
}
