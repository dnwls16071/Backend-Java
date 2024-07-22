package collectionutil;

import java.util.*;

public class OfMain {
	public static void main(String[] args) {
		// 불변
		List<Integer> list = List.of(1, 2, 3);
		Set<Integer> set = Set.of(1, 2, 3);
		Map<Integer, String> map = Map.of(1, "One", 2, "Two");

		System.out.println("list = " + list);
		System.out.println("set = " + set);
		System.out.println("map = " + map);
		System.out.println("list.class = " + list.getClass());	// 불변 컬렉션 생성
		System.out.println("set.class = " + set.getClass());	// 불변 컬렉션 생성
		System.out.println("map.class = " + map.getClass());	// 불변 컬렉션 생성

		// list.add(4);  →  Exception in thread "main" java.lang.UnsupportedOperationException

		// 가변
		List<Integer> newList = new ArrayList<>(list);
		newList.add(4);
		System.out.println("newList = " + newList);
		System.out.println("newList.getClass() = " + newList.getClass());

		// 불변
		List<Integer> unmodifiableList = Collections.unmodifiableList(newList);
		System.out.println("unmodifiableList = " + unmodifiableList);
		System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
	}
}
