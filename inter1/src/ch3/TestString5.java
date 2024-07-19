package ch3;

public class TestString5 {
	public static void main(String[] args) {
		String str = "hello.txt";
		String ext = ".txt";

		int index = str.indexOf(ext);
		String fileName = str.substring(0, index);
		String extName = str.substring(index);
		System.out.println("fileName = " + fileName);
		System.out.println("extName = " + extName);
	}
}
