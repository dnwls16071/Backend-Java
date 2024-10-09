package adv2.io.practice;

import adv2.io.practice.member.Member;
import adv2.io.practice.member.MemberRepository;
import adv2.io.practice.member.MemberRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {

	// 다형성
	// private static final MemberRepository memberRepository = new FileMemberRepositoryImpl();
	// private static final MemberRepository memberRepository = new DataMemberRepositoryImpl();
	private static final MemberRepository memberRepository = new MemberRepositoryImpl();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. 회원 등록 | 2. 회원 목록 조회 | 3. 종료");
			System.out.print("선택: ");
			int i = scanner.nextInt();
			scanner.nextLine();

			switch (i) {
				// 회원 등록
				case 1:
					registerMember(scanner);
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 옵션입니다.");
			}
		}
	}

	private static void registerMember(Scanner scanner) {
		System.out.print("ID 입력 : ");
		String id = scanner.nextLine();

		System.out.print("Name 입력 : ");
		String name = scanner.nextLine();

		System.out.print("Age 입력 : ");
		int age = scanner.nextInt();
		scanner.nextLine();

		Member member = new Member();
		member.setId(id);
		member.setName(name);
		member.setAge(age);
		memberRepository.save(member);
	}

	private static void display() {
		List<Member> all = memberRepository.findAll();
		for (Member member : all) {
			System.out.printf("[ID: %s, Name : %s, Age : %d]", member.getId(), member.getName(), member.getAge());
		}
		System.out.println();
	}
}
