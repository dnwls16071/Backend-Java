package ch3;

public class TestString10 {
	public static void main(String[] args) {
		String fruits = "apple,banana,mango";
		String[] result = fruits.split(",");
		String joinedString = String.join("→", result);

		for (String string : result) {
			System.out.println(string);
		}
		System.out.println("joinedString = " + joinedString);
	}
}
