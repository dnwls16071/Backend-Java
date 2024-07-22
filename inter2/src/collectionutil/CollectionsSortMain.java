package collectionutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("list = " + list);

		Collections.shuffle(list);
		System.out.println("list = " + list);
		Collections.sort(list);
		System.out.println("list = " + list);
		Collections.reverse(list);
		System.out.println("list = " + list);
	}
}
