package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) {
		System.out.println("===단어 입력 단계===");
		Scanner scanner = new Scanner(System.in);
		Map<String, String> dictionary = new HashMap<>();

		while (true) {
			System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
			String en = scanner.nextLine();
			if (en.equals("q")) {
				break;
			}

			System.out.print("한글 뜻을 입력하세요: ");
			String ko = scanner.nextLine();
			dictionary.put(en, ko);
		}

		System.out.println("===단어 검색 단계===");
		while (true) {
			System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
			String input = scanner.nextLine();
			if (input.equals("q")) {
				break;
			}

			if (dictionary.containsKey(input)) {
				System.out.println(input + "의 뜻: " + dictionary.get(input));
			} else {
				System.out.println(input + "은(는) 사전에 없는 단어입니다.");
			}
		}
	}
}
