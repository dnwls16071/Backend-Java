package ch5;

import java.util.Scanner;

public class AuthGradeMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 등급을 입력하세요:[GUEST, LOGIN, ADMIN] : ");
		String input = scanner.nextLine();
		AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());
		
		if (authGrade.equals(AuthGrade.GUEST)) {
			System.out.println("당신의 등급은 손님입니다.");
		} else if (authGrade.equals(AuthGrade.LOGIN)) {
			System.out.println("당신의 등급은 로그인 회원입니다.");			
		} else if (authGrade.equals(AuthGrade.ADMIN)) {
			System.out.println("당신의 등급은 관리자 등급입니다.");
		} else {
			System.out.println("잘못된 등급을 입력했습니다.");
		}
		
		if (authGrade.getLevel() > 0) {
			System.out.println("- 메인 화면");
		}
		
		if (authGrade.getLevel() > 1) {
			System.out.println("- 이메일 관리 화면");
		}
		
		if (authGrade.getLevel() > 2) {
			System.out.println("- 관리자 화면");
		}
	}
}
