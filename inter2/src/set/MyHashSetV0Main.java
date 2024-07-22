package set;

public class MyHashSetV0Main {
	public static void main(String[] args) {
		MyHashSetV0 myHashSetV0 = new MyHashSetV0();
		myHashSetV0.add(1);
		myHashSetV0.add(3);
		myHashSetV0.add(2);
 		myHashSetV0.add(4);
		System.out.println(myHashSetV0);

		boolean result = myHashSetV0.add(4);
		System.out.println("중복 데이터 저장 결과 = " + result);
		System.out.println(myHashSetV0);

		System.out.println("set.contains(3) = " + myHashSetV0.contains(3));
		System.out.println("set.contains(99) = " + myHashSetV0.contains(99));
	}
}
