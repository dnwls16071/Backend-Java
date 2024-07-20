package ch3;

public class TestString9 {
	public static void main(String[] args) {
		String email = "hello@example.com";
		String[] result = email.split("@");

		System.out.println("ID: " + result[0]);
		System.out.println("Domain: " + result[1]);
	}
}
