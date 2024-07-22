package set;

public class MyHashSetV2Main {
	public static void main(String[] args) {
		MyHashSetV2 myHashSetV2 = new MyHashSetV2(10);
		myHashSetV2.add("A");
		myHashSetV2.add("B");
		myHashSetV2.add("C");
		myHashSetV2.add("D");
		myHashSetV2.add("AB");
		myHashSetV2.add("SET");
		System.out.println(myHashSetV2);

		System.out.println("A.hashCode = " + "A".hashCode());
		System.out.println("B.hashCode = " + "B".hashCode());
		System.out.println("C.hashCode = " + "C".hashCode());
		System.out.println("D.hashCode = " + "D".hashCode());
		System.out.println("AB.hashCode = " + "AB".hashCode());
		System.out.println("SET.hashCode = " + "SET".hashCode());

		String searchValue = "SET";
		boolean result = myHashSetV2.contains(searchValue);
		System.out.println("myHashSetV2.contains(searchValue) = " + result);
	}
}
