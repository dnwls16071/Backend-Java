package comp;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {
	public static void main(String[] args) {
		User a = new User("a", 30);
		User b = new User("b", 20);
		User c = new User("c", 10);

		Set<User> set1 = new TreeSet<>();
		set1.add(a);
		set1.add(b);
		set1.add(c);
		System.out.println("==Comparable 기본 정렬==");
		System.out.println(set1);

		Set<User> set2 = new TreeSet<>(new IdComparator());
		set2.add(a);
		set2.add(b);
		set2.add(c);
		System.out.println("==Comparator 정렬==");
		System.out.println(set2);
	}
}
