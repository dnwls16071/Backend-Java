package set;

public class MyHashSetV3Main {
	public static void main(String[] args) {
		MyHashSetV2<String> set = new MyHashSetV2(10);
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);

		String searchValue = "A";
		boolean contains = set.contains("A");
		System.out.println("set.contains("+searchValue+")=" + contains);
	}
}
