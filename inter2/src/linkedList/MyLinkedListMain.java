package linkedList;

public class MyLinkedListMain {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		System.out.println("===데이터 추가===");
		System.out.println(myLinkedList);
		myLinkedList.add("a");
		System.out.println(myLinkedList);
		myLinkedList.add("b");
		System.out.println(myLinkedList);
		myLinkedList.add("c");
		System.out.println(myLinkedList);

		System.out.println("===기능 사용===");
		System.out.println("myLinkedList.getSize() = " + myLinkedList.getSize());
		System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
		System.out.println("myLinkedList.indexOf('c') = " + myLinkedList.indexOf('c'));
		System.out.println("myLinkedList.set(2, 'z') = " + myLinkedList.set(2, 'z'));
		System.out.println(myLinkedList);

		System.out.println("===범위 초과===");
		myLinkedList.add("d");
		System.out.println(myLinkedList);
		myLinkedList.add("e");
		System.out.println(myLinkedList);
		myLinkedList.add("f");
		System.out.println(myLinkedList);
	}
}
