package linkedList;

public class MyLinkedListMainV3 {
	public static void main(String[] args) {
		MyLinkedList<String> stringLinkedList = new MyLinkedList();
		stringLinkedList.add("a");
		stringLinkedList.add("b");
		stringLinkedList.add("c");
		String string = stringLinkedList.get(0);
		System.out.println("string = " + string);

		MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
		integerMyLinkedList.add(1);
		integerMyLinkedList.add(2);
		integerMyLinkedList.add(3);
		Integer integer = integerMyLinkedList.get(0);
		System.out.println("integer = " + integer);
	}
}
