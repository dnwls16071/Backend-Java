import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderWriterMainV1 {
	public static void main(String[] args) throws IOException {
		String writeString = "ABC";

		byte[] bytes = writeString.getBytes(StandardCharsets.UTF_8);
		System.out.println("write String: " + writeString);
		System.out.println("write bytes: " + Arrays.toString(bytes));

		// 파일에 쓰기
		FileOutputStream fileOutputStream = new FileOutputStream(TextConst.FILE_NAME);
		fileOutputStream.write(bytes);
		fileOutputStream.close();

		// 파일로부터 읽기
		FileInputStream fileInputStream = new FileInputStream(TextConst.FILE_NAME);
		byte[] readAllBytes = fileInputStream.readAllBytes();
		System.out.println("read bytes: " + Arrays.toString(readAllBytes));
		fileInputStream.close();

		// byte[] → String 디코딩
		String s = new String(readAllBytes, StandardCharsets.UTF_8);
		System.out.println("read String: " + s);
	}
}
