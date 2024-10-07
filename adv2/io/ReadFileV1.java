package io;

import java.io.FileInputStream;
import java.io.IOException;

import static io.BufferedConst.FILE_NAME;

public class ReadFileV1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(FILE_NAME);

		long startTime = System.currentTimeMillis();

		int fileSize = 0;
		int data;
		while ((data = fileInputStream.read()) != -1) {
			fileSize++;
		}
		fileInputStream.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 읽기 소요 시간: " + (endTime - startTime) + "ms");
	}
}
