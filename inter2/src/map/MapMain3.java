package map;

import java.util.HashMap;

public class MapMain3 {
	public static void main(String[] args) {
		HashMap<String, Integer> studentMap = new HashMap<>();

		// 데이터 추가
		studentMap.put("studentA", 50);
		System.out.println(studentMap);

		// 학생이 없는 경우에만 데이터를 추가하도록 (1)
		if (!studentMap.containsKey("studentA")) {
			studentMap.put("studentA", 100);
		}
		System.out.println(studentMap);

		// 학생이 없는 경우에만 데이터를 추가하도록 (2)
		studentMap.putIfAbsent("studentA", 150);
		studentMap.putIfAbsent("studentB", 90);
		System.out.println(studentMap);
	}
}
