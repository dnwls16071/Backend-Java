package generic2;

public class Animal {
	private String name;
	private int size;

	public Animal(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void sound() {
		System.out.println("sound");
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", size=" + size +
				'}';
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}
