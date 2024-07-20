package ch6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2024, 1, 1);
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("날짜 " + (i + 1) + ": " + of);
			of = of.plusWeeks(2);
		}
		*/

		for (int i = 0; i < 5; i++) {
			LocalDate nextDate = of.plus(2 * i, ChronoUnit.WEEKS);
			System.out.println("날짜: " + (i + 1) + ": " + nextDate);
		}
	}
}
