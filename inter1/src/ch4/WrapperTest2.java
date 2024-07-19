package ch4;

public class WrapperTest2 {
	public static void main(String[] args) {
		String[] array = {"1.5", "2.5", "3.0"};

		double sum = 0.0;
		for (String string : array) {
			double d = Double.parseDouble(string);
			sum += d;
		}
		System.out.println("sum = " + sum);
	}
}
