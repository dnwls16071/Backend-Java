import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriterMainV2 {
	public static void main(String[] args) throws IOException {
		String writeString = "ABC";
		System.out.println("write String = " + writeString);
		
		// 파일에 쓰기
		FileOutputStream fileOutputStream = new FileOutputStream(TextConst.FILE_NAME);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
		outputStreamWriter.write(writeString);
		outputStreamWriter.close();
		
		// 파일로부터 읽기
		FileInputStream fileInputStream = new FileInputStream(TextConst.FILE_NAME);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

		StringBuilder stringBuilder = new StringBuilder();
		int data;
		while ((data = inputStreamReader.read()) != -1) {
			stringBuilder.append((char) data);
		}
		inputStreamReader.close();
		System.out.println("read String = " + stringBuilder);
	}
}
