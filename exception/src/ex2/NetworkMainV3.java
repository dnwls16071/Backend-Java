package ex2;

import java.util.Scanner;

public class NetworkMainV3 {
	public static void main(String[] args) throws NetworkClientExceptionV2 {
		NetworkServiceV3 networkService = new NetworkServiceV3();
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
