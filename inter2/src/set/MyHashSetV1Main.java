package set;

public class MyHashSetV1Main {
	public static void main(String[] args) {
		MyHashSetV1 myHashSetV1 = new MyHashSetV1(10);
		myHashSetV1.add(1);
		myHashSetV1.add(2);
		myHashSetV1.add(5);
		myHashSetV1.add(8);
		myHashSetV1.add(14);
		myHashSetV1.add(99);
		myHashSetV1.add(9);
		System.out.println(myHashSetV1);

		int value = 9;
		boolean result = myHashSetV1.contains(value);
		System.out.println("set.contains("+value+")="+result);

		boolean removedResult = myHashSetV1.remove(value);
		System.out.println("set.remove("+value+")="+removedResult);
		System.out.println(myHashSetV1);
	}
}
