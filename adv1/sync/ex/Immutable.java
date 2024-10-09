package adv1.sync.ex;

// 여러 쓰레드가 공유 가능한 자원이라고 하더라도 그 값을 아무도 변경할 수 없다면 문제가 되지 않는다.
// 이 경우 모든 쓰레드가 항상 같은 값을 읽기 때문이다.
// 필드에 불변을 의미하는 final이 붙게 되면 어떤 쓰레드도 값을 변경할 수 없다.
// 따라서 멀티 쓰레드 환경에서 문제 없는 안전한 공유 자원이 된다.
public class Immutable {
	private final int value;

	public Immutable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
