package set;

import java.util.HashSet;
import java.util.Set;

public class UniqueNameTest1 {
	public static void main(String[] args) {
		Integer[] inputArr = {30, 20, 20, 10, 10};
	
		// 중복 제거
		Set<Integer> set = new HashSet<>();
		for (Integer i : inputArr) {
			set.add(i);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
