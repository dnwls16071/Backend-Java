package array;

public class MyArrayListMainV3 {
	public static void main(String[] args) {
		MyArrayListV3 myArrayList = new MyArrayListV3();

		myArrayList.add("a");
		myArrayList.add("b");
		myArrayList.add("c");
		System.out.println(myArrayList);

		// 원하는 위치에 데이터 추가하기
		myArrayList.add(3, "addLast");
		System.out.println(myArrayList);
		myArrayList.add(0, "addFirst");
		System.out.println(myArrayList);

		System.out.println();

		// 삭제
		Object removed1 = myArrayList.remove(4);
		System.out.println("remove(4) = " + removed1);
		System.out.println(myArrayList);

		Object removed2 = myArrayList.remove(0);
		System.out.println("remove(0) = " + removed2);
		System.out.println(myArrayList);
	}
}
