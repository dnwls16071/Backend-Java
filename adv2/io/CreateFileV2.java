package io;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.BufferedConst.*;

public class CreateFileV2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		byte[] buffer = new byte[BUFFER_SIZE];
		int bufferIndex = 0;

		for (int i = 0; i < FILE_SIZE; i++) {
			buffer[bufferIndex++] = 1;

			// 버퍼가 가득 차면 버퍼를 비우기
			if (bufferIndex == BUFFER_SIZE) {
				fileOutputStream.write(buffer);
				bufferIndex = 0;
			}
		}

		// 버퍼가 가득 차지 않은 상태인 경우
		if (bufferIndex > 0) {
			fileOutputStream.write(buffer, 0, bufferIndex);
		}
		fileOutputStream.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 생성 소요 시간: " + (endTime - startTime) + "ms");
	}
}
