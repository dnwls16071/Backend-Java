package ch2;

public class ImmutableMyDateMain {
	public static void main(String[] args) {
		ImmutableMyDate immutableMyDate1 = new ImmutableMyDate(2024, 1, 1);
		ImmutableMyDate immutableMyDate2 = immutableMyDate1;

		System.out.println("immutableMyDate1 = " + immutableMyDate1);
		System.out.println("immutableMyDate2 = " + immutableMyDate2);

		ImmutableMyDate r1 = immutableMyDate2.withYear(2025);
		System.out.println("r1 = " + r1);

		ImmutableMyDate r2 = immutableMyDate2.withMonth(2);
		System.out.println("r2 = " + r2);

		ImmutableMyDate r3 = immutableMyDate2.withDay(3);
		System.out.println("r3 = " + r3);
	}
}
