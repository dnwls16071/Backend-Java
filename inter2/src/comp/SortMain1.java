package comp;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {
	public static void main(String[] args) {
		Integer[] array = {3, 2, 1};
		System.out.println(Arrays.toString(array));

		System.out.println("===기본 정렬 후===");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("===AscComparator 적용===");
		Arrays.sort(array, new AscComparator());
		System.out.println(Arrays.toString(array));

		System.out.println();

		System.out.println("===DescComparator 적용===");
		Arrays.sort(array, new DescComparator());
		System.out.println(Arrays.toString(array));
		System.out.println("===AscComparator.reversed() 적용===");
		Arrays.sort(array, new AscComparator().reversed());
		System.out.println(Arrays.toString(array));
	}

	static class AscComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? -1 : (o1 == o2) ? 0 : 1;
		}
	}

	static class DescComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			//return o1 < o2 ? 1 : (o1 == o2) ? 0 : -1;
			return o2 > o1 ? 1 : (o1 == o2) ? 0 : -1;
		}
	}
}
