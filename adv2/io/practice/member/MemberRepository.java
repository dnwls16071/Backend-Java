package adv2.io.practice.member;

import java.util.List;

public interface MemberRepository {
	void save(Member member);
	List<Member> findAll();
}
