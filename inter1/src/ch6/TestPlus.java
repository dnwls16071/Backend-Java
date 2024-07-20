package ch6;

import java.time.LocalDateTime;

public class TestPlus {
	public static void main(String[] args) {
		LocalDateTime of = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
		System.out.println("기준 시각: " + of);

		LocalDateTime plusDate = of.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
		System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusDate);
	}
}
