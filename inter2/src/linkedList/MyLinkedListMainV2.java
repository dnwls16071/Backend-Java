package linkedList;

public class MyLinkedListMainV2 {
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

		// 첫 번째 항목에 추가, 삭제
		myLinkedList.add(0, "d");
		System.out.println(myLinkedList);
		myLinkedList.remove(0);
		System.out.println(myLinkedList);

		// 중간 항목에 추가, 삭제
		myLinkedList.add(1, "e");
		System.out.println(myLinkedList);
		myLinkedList.remove(2);
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
