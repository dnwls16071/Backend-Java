package adv2.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReaderWriterMainV2 {

	private static final String FILEPATH = "file/hello.txt";

	public static void main(String[] args) throws IOException {

		String writeString = "abc\n가나다";

		Path path = Path.of(FILEPATH);

		// 파일에 쓰기
		Files.writeString(path, writeString, StandardCharsets.UTF_8);

		// 파일에서 읽기(한 줄씩 읽기)
		List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
