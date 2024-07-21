package generic2;

public class UnitUtil {
	// 타입 매개변수 제한 제네릭 메서드
	static <T extends BioUnit> T maxHp(T t1, T t2) {
		return t1.getHp() > t2.getHp() ? t1 : t2;
	}
}
