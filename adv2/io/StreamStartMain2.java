package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("store/hello.dat");
		byte[] input = {65, 66 ,67};
		fileOutputStream.write(input);
		fileOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("store/hello.dat");
		byte[] buffer = new byte[10];

		// 읽은 결과를 버퍼에 담아라.
		int readCount = fileInputStream.read(buffer);
		System.out.println("readCount = " + readCount);
		System.out.println(Arrays.toString(buffer));
	}
}
