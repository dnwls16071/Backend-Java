package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("store/hello.dat");
		fileOutputStream.write(65);
		fileOutputStream.write(66);
		fileOutputStream.write(67);
		fileOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("store/hello.dat");

		int data;
		while ((data = fileInputStream.read()) != -1) {
			System.out.println(data);

		}
		fileInputStream.close();
	}
}
