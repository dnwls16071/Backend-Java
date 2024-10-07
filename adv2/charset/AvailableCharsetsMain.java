package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {
	public static void main(String[] args) {
		// 이용 가능한 모든 Charset 자바 + OS
		SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();

		for (String s : stringCharsetSortedMap.keySet()) {
			System.out.println("charsetName = " + s);
		}

		// 별칭 조회
		Charset charset = Charset.forName("MS949");
		Set<String> aliases = charset.aliases();

		for (String alias : aliases) {
			System.out.println("alias = " + alias);
		}

		// UTF-8 문자 조회
		// StandardCharsets.UTF_8 → 상수
		Charset charset1 = Charset.forName("UTF-8");
		Set<String> aliases1 = charset1.aliases();

		for (String alias : aliases1) {
			System.out.println("alias = " + alias);
		}

		// 기본 Charset 조회
		Charset charset2 = Charset.defaultCharset();
		System.out.println("charset = " + charset2);
	}
}
