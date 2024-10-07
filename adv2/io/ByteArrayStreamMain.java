package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {
	public static void main(String[] args) throws IOException {
		byte[] input = {1, 2, 3};

		// 메모리에 쓰기
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.write(input);

		// 메모리로부터 읽기
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input);
		byte[] bytes = byteArrayInputStream.readAllBytes();
		System.out.println(Arrays.toString(bytes));
		byteArrayInputStream.close();
	}
}
