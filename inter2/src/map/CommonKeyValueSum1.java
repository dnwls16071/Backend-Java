package map;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("B", 4);
		map2.put("C", 5);
		map2.put("D", 6);

		Map<String, Integer> result = new HashMap<>();
		for (String string : map1.keySet()) {
			if (map2.containsKey(string)) {
				result.put(string, map1.get(string) + map2.get(string));
			}
		}
		System.out.println(result);
	}
}
