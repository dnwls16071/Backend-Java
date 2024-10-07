package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.BufferedConst.*;

public class CreateFileV3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE);
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < FILE_SIZE; i++) {
			bufferedOutputStream.write(1);
		}
		fileOutputStream.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 생성 소요 시간: " + (endTime - startTime) + "ms");
	}
}
