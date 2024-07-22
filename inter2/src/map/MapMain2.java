package map;

import java.util.HashMap;

public class MapMain2 {
	public static void main(String[] args) {
		HashMap<String, Integer> studentMap = new HashMap<>();

		// 데이터 추가
		studentMap.put("studentA", 90);
		System.out.println(studentMap);

		// 이미 해당 키가 있다면 값을 교체
		studentMap.put("studentA", 100);
		System.out.println(studentMap);

		// 해당 키가 이미 Map에 있는지
		boolean b = studentMap.containsKey("studentA");
		System.out.println("b = " + b);

		// 특정 데이터 삭제
		studentMap.remove("studentA");
		System.out.println(studentMap);
	}
}
