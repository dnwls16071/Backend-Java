package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
	public static void main(String[] args) {
		HashMap<String, Integer> studentMap = new HashMap<>();

		studentMap.put("studentA", 90);
		studentMap.put("studentB", 80);
		studentMap.put("studentC", 80);
		studentMap.put("studentD", 100);
		System.out.println(studentMap);

		Integer score = studentMap.get("studentA");
		System.out.println(score);

		System.out.println("===keySet 활용===");
		Set<String> keySet = studentMap.keySet();
		for (String string : keySet) {
			Integer value = studentMap.get(string);
			System.out.println("key = " + string + ", value = " + value);
		}

		System.out.println("===entrySet 활용===");
		Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
		for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
			String key = stringIntegerEntry.getKey();
			Integer value = stringIntegerEntry.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

		System.out.println("===values 활용===");
		Collection<Integer> values = studentMap.values();
		for (Integer integer : values) {
			System.out.println("value = " + integer);
		}
	}
}
