package generic;

public class PairMain {
	public static void main(String[] args) {
		Pair<Integer, String> part1 = new Pair<>();
		part1.setFirst(1);
		part1.setSecond("data");
		System.out.println(part1.getFirst());
		System.out.println(part1.getSecond());
		System.out.println(part1);

		Pair<String, String> part2 = new Pair<>();
		part2.setFirst("key");
		part2.setSecond("value");
		System.out.println(part2.getFirst());
		System.out.println(part2.getSecond());
		System.out.println(part2);
	}
}
