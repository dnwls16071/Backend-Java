import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedWriterMain {

	private static final int BUFFER_SIZE = 8192;

	public static void main(String[] args) throws IOException {
		String writeString = "ABC";

		// 파일에 쓰기
		FileWriter fileWriter = new FileWriter(TextConst.FILE_NAME, StandardCharsets.UTF_8);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, BUFFER_SIZE);
		bufferedWriter.write(writeString);
		bufferedWriter.close();
		
		// 파일로부터 읽기
		StringBuilder stringBuilder = new StringBuilder();
		FileReader fileReader = new FileReader(TextConst.FILE_NAME, StandardCharsets.UTF_8);
		BufferedReader reader = new BufferedReader(fileReader, BUFFER_SIZE);

		String line;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
		}
		reader.close();
		System.out.println(stringBuilder);
	}
}
