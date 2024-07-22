package collectionutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		List<Integer> list3 = Collections.emptyList();
		List<Integer> list4 = List.of();

		System.out.println(list1.getClass());	// class java.util.ArrayList
		System.out.println(list2.getClass());	// class java.util.LinkedList
		System.out.println(list3.getClass());	// class java.util.Collections$EmptyList
		System.out.println(list4.getClass());	// class java.util.ImmutableCollections$ListN
	}
}
