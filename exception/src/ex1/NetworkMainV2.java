package ex1;

import java.util.Scanner;

public class NetworkMainV2 {
	public static void main(String[] args) {
		NetworkServiceV2 networkService = new NetworkServiceV2();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("전송할 데이터: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}
			networkService.sendMessage(input);
			System.out.println();
		}
		System.out.println("프로그램 정상 종료");
	}
}
