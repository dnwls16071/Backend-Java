package map;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
