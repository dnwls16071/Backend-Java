package ch5;

import java.util.Scanner;

public class HttpStatusMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("HTTP CODE: ");
		int code = scanner.nextInt();

		HttpStatus httpStatus = HttpStatus.findByCode(code);
		if (httpStatus == null) {
			System.out.println("정의되지 않은 코드입니다.");
		} else {
			System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
			System.out.println("isSuccess = " + httpStatus.isSuccess());
		}
	}
}
