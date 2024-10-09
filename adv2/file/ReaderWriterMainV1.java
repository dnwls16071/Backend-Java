package adv2.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderWriterMainV1 {

	private static final String FILEPATH = "file/hello.txt";

	public static void main(String[] args) throws IOException {

		String writeString = "abc\n가나다";

		Path path = Path.of(FILEPATH);

		// 파일에 쓰기
		Files.writeString(path, writeString, StandardCharsets.UTF_8);

		// 파일에서 읽기
		String readString = Files.readString(path, StandardCharsets.UTF_8);
		System.out.println(readString);
	}
}
