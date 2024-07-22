package comp;

public class User implements Comparable<User> {

	private String id;
	private int age;

	public User(String id, int age) {
		this.id = id;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(User target) {
		return this.age > target.age ? 1 : (this.age == target.age) ? 0 : -1;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", age=" + age +
				'}';
	}
}
