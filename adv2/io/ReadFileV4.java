package io;

import java.io.FileInputStream;
import java.io.IOException;

import static io.BufferedConst.FILE_NAME;

public class ReadFileV4 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		byte[] bytes = fis.readAllBytes();
		fis.close();

		long endTime = System.currentTimeMillis();
		System.out.println("파일 읽기 소요 시간: " + (endTime - startTime) + "ms");
	}
}
