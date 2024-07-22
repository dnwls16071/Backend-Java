package generic;

public class ContainerTest {
	public static void main(String[] args) {
		Container<String> stringContainer = new Container<>();
		System.out.println("빈값 확인: " + stringContainer.isEmpty());

		stringContainer.setValue("data1");
		System.out.println("저장 데이터: " + stringContainer.getValue());
		System.out.println("빈값 확인: " + stringContainer.isEmpty());

		Container<Integer> intergerContainer = new Container<>();
		intergerContainer.setValue(10);
		System.out.println("저장 데이터: " + intergerContainer.getValue());
	}
}
