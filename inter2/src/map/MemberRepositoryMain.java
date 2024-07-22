package map;

public class MemberRepositoryMain {
	public static void main(String[] args) {
		Member m1 = new Member("id1", "회원1");
		Member m2 = new Member("id2", "회원2");
		Member m3 = new Member("id3", "회원3");

		MemberRepository memberRepository = new MemberRepository();
		memberRepository.save(m1);
		memberRepository.save(m2);
		memberRepository.save(m3);
		System.out.println("memberRepository = " + memberRepository);

		Member findMember1 = memberRepository.findById("id1");
		System.out.println("findMember1 = " + findMember1);

		Member findMember3 = memberRepository.findByName("회원3");
		System.out.println("findMember3 = " + findMember3);

		memberRepository.remove("id1");
		Member removedMember = memberRepository.findById("id1");
		System.out.println("removedMember = " + removedMember);
	}
}
