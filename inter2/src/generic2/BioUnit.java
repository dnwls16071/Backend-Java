package generic2;

public class BioUnit {
	private String name;
	private int hp;

	@Override
	public String toString() {
		return "BioUnit{" +
				"name='" + name + '\'' +
				", hp=" + hp +
				'}';
	}

	public BioUnit(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
