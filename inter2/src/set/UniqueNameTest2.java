package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNameTest2 {
	public static void main(String[] args) {
		Integer[] inputArr = {30, 20, 20, 10, 10};

		// 중복 제거와 입력 순서 유지
		Set<Integer> set = new LinkedHashSet<>();
		for (Integer i : inputArr) {
			set.add(i);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
