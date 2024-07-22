package collectionutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		// list.getClass() = class java.util.ArrayList
		System.out.println("list.getClass() = " + list.getClass());

		List<Integer> synchronizedList = Collections.synchronizedList(list);

		// synchronizedList.getClass() = class java.util.Collections$SynchronizedRandomAccessList
		System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
	}
}
