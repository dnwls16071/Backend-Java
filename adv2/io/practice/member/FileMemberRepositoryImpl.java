package adv2.io.practice.member;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileMemberRepositoryImpl implements MemberRepository {

	private static final String FILE_PATH = "file/member.txt";
	private static final String DELIMITER = ",";

	@Override
	public void save(Member member) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
			bufferedWriter.write(member.getId() + DELIMITER + member.getName() + DELIMITER + member.getAge());
			bufferedWriter.newLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Member> findAll() {
		List<Member> members = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH, StandardCharsets.UTF_8))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(DELIMITER);
				Member member = new Member();
				member.setId(data[0]);
				member.setName(data[1]);
				member.setAge(Integer.valueOf(data[2]));
				members.add(member);
			}
		} catch (FileNotFoundException e) {
			return new ArrayList<>();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return members;
	}
}
