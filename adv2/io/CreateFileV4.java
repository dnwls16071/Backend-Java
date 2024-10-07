package io;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.BufferedConst.*;

public class CreateFileV4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		byte[] buffer = new byte[FILE_SIZE];
		for (int i = 0; i < FILE_SIZE; i++) {
			buffer[i] = 1;
		}
		fileOutputStream.write(buffer);	// 한 번에 쓰기
		fileOutputStream.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 생성 소요 시간: " + (endTime - startTime) + "ms");
	}
}
