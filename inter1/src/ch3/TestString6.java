package ch3;

public class TestString6 {
	public static void main(String[] args) {
		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int index = str.indexOf(key);
		int count = 0;
		while (index >= 0) {
			// fromIndex : 무한루프에 빠지지 않게끔 하기 위해 시작 시점을 계속 갱신해줘야함
			// public int indexOf(String str, int fromIndex) {
			// 		return indexOf(value, coder(), length(), str, fromIndex);
			// }
			index = str.indexOf(key, index + 1);
			count++;
		}
		System.out.println("count = " + count);
	}
}
