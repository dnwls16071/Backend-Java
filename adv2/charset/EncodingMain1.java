package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingMain1 {

	private static final Charset EUC_KR = Charset.forName("EUC-KR");
	private static final Charset MS949 = Charset.forName("MS949");

	public static void main(String[] args) {
		encoding("A", StandardCharsets.US_ASCII);
		encoding("A", StandardCharsets.ISO_8859_1);
		encoding("A", StandardCharsets.UTF_8);
		encoding("A", EUC_KR);
		encoding("A", MS949);
	}

	private static void encoding(String text, Charset charset) {
		byte[] bytes = text.getBytes(charset);
		System.out.printf("%s → [%s] 인코딩 → %s %s byte\n", text, charset, Arrays.toString(bytes), bytes.length);
	}
}
