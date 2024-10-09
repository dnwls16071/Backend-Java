package adv2.io.practice.member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {

	private final List<Member> members = new ArrayList<>();

	@Override
	public void save(Member member) {
		members.add(member);
	}

	@Override
	public List<Member> findAll() {
		return members;
	}
}
