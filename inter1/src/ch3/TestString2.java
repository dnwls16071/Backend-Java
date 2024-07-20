package ch3;

public class TestString2 {
	public static void main(String[] args) {
		String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

		int sum = 0;
		for (String string : arr) {
			System.out.println(string + ":" + string.length());
			sum += string.length();
		}
		System.out.println("sum = " + sum);
	}
}
