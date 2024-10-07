package io;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.BufferedConst.*;

public class CreateFileV1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < FILE_SIZE; i++) {
			fileOutputStream.write(1);
		}
		fileOutputStream.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 생성 소요 시간: " + (endTime - startTime) + "ms");
	}
}
