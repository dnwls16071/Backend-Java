package ex2;

import java.util.Scanner;

public class NetworkMainV5 {
	public static void main(String[] args) {
		NetworkServiceV5 networkService = new NetworkServiceV5();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("전송할 데이터: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}

			try {
				networkService.sendMessage(input);
			} catch (Exception e) {
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램 정상 종료");
	}

	// 공통 예외 처리(예외를 한 곳에서 처리할 수 있도록)
	private static void exceptionHandler(Exception e) {
		System.out.println("==사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
		System.out.println("==개발자용 디버깅 메시지==");
		e.printStackTrace(System.out); // 스택 트레이스

		// 필요하다면 예외 별로 별도의 추가 처리 가능함
		// instanceOf
		if (e instanceof SendExceptionV5 sendExceptionV5) {
			System.out.println("[전송 오류] 전송 데이터: " + sendExceptionV5.getData());
		}

		if (e instanceof ConnectExceptionV5 connectExceptionV5) {
			System.out.println("[연결 오류] 연결: " + connectExceptionV5.getAddress());
		}
	}
}
