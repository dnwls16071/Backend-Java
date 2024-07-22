package comp;

import java.util.Arrays;

public class SortMain3 {
	public static void main(String[] args) {
		User a = new User("a", 30);
		User b = new User("b", 20);
		User c = new User("c", 10);
		User[] array = {a, b, c };

		System.out.println("===기본 데이터===");
		System.out.println(Arrays.toString(array));

		System.out.println("===IdComparator 정렬===");
		Arrays.sort(array, new IdComparator());
		System.out.println(Arrays.toString(array));

		System.out.println("===IdComparator.reversed()===");
		Arrays.sort(array, new IdComparator().reversed());
		System.out.println(Arrays.toString(array));
	}
}
