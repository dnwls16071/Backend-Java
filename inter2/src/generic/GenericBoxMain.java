package generic;

public class GenericBoxMain {
	public static void main(String[] args) {
		GenericBox<Integer> integerGenericBox = new GenericBox<>();
		integerGenericBox.setValue(10);
		Integer value = integerGenericBox.getValue();
		System.out.println(value);

		GenericBox<String> stringGenericBox = new GenericBox<>();
		stringGenericBox.setValue("문자100");
		String value1 = stringGenericBox.getValue();
		System.out.println(value1);

		GenericBox<Double> doubleGenericBox = new GenericBox<>();
		doubleGenericBox.setValue(3.141592);
		Double value2 = doubleGenericBox.getValue();
		System.out.println(value2);
	}
}
