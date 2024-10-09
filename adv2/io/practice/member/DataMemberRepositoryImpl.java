package adv2.io.practice.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMemberRepositoryImpl implements MemberRepository {

	private static final String DATA_PATH = "data/data.dat";

	@Override
	public void save(Member member) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(DATA_PATH, true))) {
			dos.writeUTF(member.getId());
			dos.writeUTF(member.getName());
			dos.writeInt(member.getAge());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Member> findAll() {
		List<Member> members = new ArrayList<>();

		try (DataInputStream dis = new DataInputStream(new FileInputStream(DATA_PATH))) {
			while (dis.available() > 0) {
				Member member = new Member();
				member.setId(dis.readUTF());
				member.setName(dis.readUTF());
				member.setAge(dis.readInt());
				members.add(member);
			}
		} catch (FileNotFoundException e) {
			return new ArrayList<>();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}

		return members;
	}
}
