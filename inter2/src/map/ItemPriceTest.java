package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemPriceTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("사과", 500);
		map.put("바나나", 500);
		map.put("망고", 1000);
		map.put("딸기", 1000);

		ArrayList<String> arrayList = new ArrayList<>();
		for (String string : map.keySet()) {
			Integer i = map.get(string);
			if (i == 1000) {
				arrayList.add(string);
			}
		}
		System.out.println(arrayList);
	}
}
