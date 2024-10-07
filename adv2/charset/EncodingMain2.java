package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingMain2 {

	private static final Charset EUC_KR = Charset.forName("EUC-KR");
	private static final Charset MS949 = Charset.forName("MS949");

	public static void main(String[] args) {
		test("A", EUC_KR, MS949);
		test("A", StandardCharsets.US_ASCII, StandardCharsets.ISO_8859_1);
		test("A", StandardCharsets.US_ASCII, EUC_KR);
		test("A", StandardCharsets.US_ASCII, MS949);
		test("A", StandardCharsets.US_ASCII, StandardCharsets.UTF_8);

		test("가나다라", StandardCharsets.US_ASCII, StandardCharsets.US_ASCII);	//	????
		test("가나다라", StandardCharsets.US_ASCII, StandardCharsets.UTF_8);	//	????
	}

	private static void test(String text, Charset encodingCharset, Charset decodingCharset) {
		byte[] bytes = text.getBytes(encodingCharset);
		String result = new String(bytes, decodingCharset);
		System.out.printf("%s → [%s] 인코딩 → [%s] 디코딩 → %s\n", text, encodingCharset, decodingCharset, result);
	}
}
