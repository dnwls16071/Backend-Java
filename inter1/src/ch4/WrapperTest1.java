package ch4;

public class WrapperTest1 {
	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";

		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		System.out.println("두 수의 합 : " + (i1 + i2));
	}
}
