package comp;

import java.util.ArrayList;
import java.util.List;

public class SortMain4 {
	public static void main(String[] args) {
		User a = new User("a", 30);
		User b = new User("b", 20);
		User c = new User("c", 10);

		List<User> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println("==기본 데이터==");
		System.out.println(list);

		System.out.println("==Comparable 기본 정렬==");
		list.sort(null);
		System.out.println(list);

		System.out.println("==IdComparator 정렬==");
		list.sort(new IdComparator());
		System.out.println(list);
	}
}
