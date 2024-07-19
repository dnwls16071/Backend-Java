package ch9;

public class Album extends Item {
	private String artist;

	Album(String name, int price, String artist) {
		super(name, price);
		this.artist = artist;
	}

	@Override
	public void print() {
		super.print();	// 부모 클래스의 print() 메서드 호출
		System.out.println("- 아티스트: " + artist);
	}
}
