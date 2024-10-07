package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("store/hello.dat");
		byte[] input = {65, 66 ,67};
		fileOutputStream.write(input);
		fileOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("store/hello.dat");

		// 모든 byte를 한 번에 읽기
		byte[] bytes = fileInputStream.readAllBytes();
		System.out.println(Arrays.toString(bytes));
		fileInputStream.close();
	}
}
