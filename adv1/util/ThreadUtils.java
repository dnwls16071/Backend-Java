package adv1.util;

import static adv1.util.Logger.log;

public abstract class ThreadUtils {

	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			log("인터럽트 발생 : " + e.getMessage());
			throw new RuntimeException(e);
		}
	}
}
