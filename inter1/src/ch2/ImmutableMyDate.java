package ch2;

public class ImmutableMyDate {
	private final int year;		// 한 번만 초기화가 가능하도록 final 키워드 사용
	private final int month;	// 한 번만 초기화가 가능하도록 final 키워드 사용
	private final int day;		// 한 번만 초기화가 가능하도록 final 키워드 사용

	public ImmutableMyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "ImmutableMyDate{" +
				"year=" + year +
				", month=" + month +
				", day=" + day +
				'}';
	}

	// 공유 참조와 사이드 이펙트 방지를 위한 불변 객체 생성
	public ImmutableMyDate withYear(int year) {
		return new ImmutableMyDate(year, month, day);
	}

	// 공유 참조와 사이드 이펙트 방지를 위한 불변 객체 생성
	public ImmutableMyDate withMonth(int month) {
		return new ImmutableMyDate(year, month, day);
	}

	// 공유 참조와 사이드 이펙트 방지를 위한 불변 객체 생성
	public ImmutableMyDate withDay(int day) {
		return new ImmutableMyDate(year, month, day);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
