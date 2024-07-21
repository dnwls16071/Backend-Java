package array;

public class MyArrayListMainV4 {
	public static void main(String[] args) {
		MyArrayListV4<String> stringMyArrayListV4 = new MyArrayListV4();

		stringMyArrayListV4.add("a");
		stringMyArrayListV4.add("b");
		stringMyArrayListV4.add("c");
		System.out.println(stringMyArrayListV4);

		MyArrayListV4<Integer> integerMyArrayListV4 = new MyArrayListV4<>();
		integerMyArrayListV4.add(1);
		integerMyArrayListV4.add(2);
		integerMyArrayListV4.add(3);
		Integer integer = integerMyArrayListV4.get(0);
		System.out.println("integer = " + integer);
	}
}
