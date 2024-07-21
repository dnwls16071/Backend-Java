package generic2;

public class GenericMethodMain {
	public static void main(String[] args) {
		Integer i = 10;
		Object object = GenericMethod.objMethod(i);

		System.out.println("== 명시적 타입 인자 전달 ==");
		Integer result1 = GenericMethod.generateMethod1(i);
		Integer result2 = GenericMethod.generateMethod2(10);
		Double result3 = GenericMethod.generateMethod2(3.141592);

		GenericMethod genericMethod = new GenericMethod();
		genericMethod.instanceMethod(i);
	}
}
