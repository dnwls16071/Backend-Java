package adv1.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void log(Object obj) {
		String time = LocalTime.now().format(dateTimeFormatter);
		System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
	}
}
