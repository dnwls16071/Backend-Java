package set;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {
	public static void main(String[] args) {
		Integer[] inputArr = {30, 20, 20, 10, 10};

		// 중복 제거와 데이터 순서 유지
		Set<Integer> set = new TreeSet<>();
		for (Integer i : inputArr) {
			set.add(i);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
