package map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
	public static void main(String[] args) {
		String test = "orange banana apple apple banana apple";
		Map<String, Integer> dictionary = new HashMap<>();
		String[] s = test.split(" ");

		for (String string : s) {
			dictionary.put(string, dictionary.getOrDefault(string, 0) + 1);
		}
		System.out.println(dictionary);
	}
}
