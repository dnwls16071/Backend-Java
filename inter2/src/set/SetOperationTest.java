package set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("합집합: " + union);

		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("교집합: " + intersection);

		Set<Integer> set1Diffset2 = new HashSet<>(set1);
		set1Diffset2.removeAll(set2);
		System.out.println("교집합1: " + set1Diffset2);

		Set<Integer> set2Diffset1 = new HashSet<>(set2);
		set2Diffset1.removeAll(set1);
		System.out.println("교집합2: " + set2Diffset1);
	}
}
