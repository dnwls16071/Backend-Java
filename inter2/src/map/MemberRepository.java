package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

	private static final Map<String, Member> memberRepository = new HashMap<>();

	public void save(Member m) {
		memberRepository.put(m.getId(), m);
	}

	public Member findById(String id) {
		return memberRepository.get(id);
	}

	public Member findByName(String name) {
		Collection<Member> values = memberRepository.values();
		for (Member value : values) {
			if (value.getName().equals(name)) {
				return value;
			}
		}
		return null;
	}

	public void remove(String id) {
		memberRepository.remove(id);
	}
}
