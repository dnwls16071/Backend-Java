package ch6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
	public static void main(String[] args) {
		int year = 2024;
		int month = 1;

		// DayOfWeek 사용 방법에 대한 생소함이 있었던 문제
		LocalDate of = LocalDate.of(year, month, 1);
		DayOfWeek firstDayOfWeek = of.getDayOfWeek();
		System.out.println(firstDayOfWeek);
		System.out.println(of.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
	}
}
