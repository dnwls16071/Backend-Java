package ch9;

public class Movie extends Item {
	private String actor;
	private String director;

	Movie(String name, int price, String actor, String director) {
		super(name, price);
		this.actor = actor;
		this.director = director;
	}

	@Override
	public void print() {
		super.print();	// 부모 클래스의 print() 메서드 호출
		System.out.println("- 감독: " + director + ", 배우: " + actor);
	}
}
