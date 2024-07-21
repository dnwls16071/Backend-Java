package array;

public class MyArrayListMain {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		System.out.println("==데이터 추가==");
		System.out.println(myArrayList);
		myArrayList.add("a");
		System.out.println(myArrayList);
		myArrayList.add("b");
		System.out.println(myArrayList);
		myArrayList.add("c");
		System.out.println(myArrayList);

		System.out.println("==기능 사용==");
		System.out.println("myArrayList.size() = " + myArrayList.size());
		System.out.println("myArrayList.get(1) = " + myArrayList.get(1));
		System.out.println("myArrayList.indexOf('c') = " + myArrayList.indexOf("c"));
		System.out.println("myArrayList.set(2, 'z'), oldValue = " + myArrayList.set(2, 'z'));
		System.out.println(myArrayList);

		System.out.println("==범위 초과==");
		myArrayList.add("d");
		System.out.println(myArrayList);
		myArrayList.add("e");
		System.out.println(myArrayList);
		myArrayList.add("f");
		System.out.println(myArrayList);
	}
}
