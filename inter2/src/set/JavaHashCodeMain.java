package set;

public class JavaHashCodeMain {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println("obj1.hashCode = " + obj1.hashCode());
		System.out.println("obj2.hashCode = " + obj2.hashCode());

		Integer i1 = 10;
		Integer i2 = -1;

		String strA = "A";
		String strAB = "AB";

		System.out.println("i1.hashCode = " + i1.hashCode());
		System.out.println("i2.hashCode = " + i2.hashCode());
		System.out.println("strA.hashCode = " + strA.hashCode());
		System.out.println("strAB.hashCode = " + strAB.hashCode());

		Member m1 = new Member("id-100");
		Member m2 = new Member("id-100");
		System.out.println("m1 == m2 → " + (m1 == m2));
		// Member 클래스 내부에 equals()와 hashCode() 미구현 상황이면 false가 나옴
		// 기본적으로 Object에서 주어지는 메서드인 equals는 == 비교이므로
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
}
