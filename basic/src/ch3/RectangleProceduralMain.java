package ch3;

public class RectangleProceduralMain {
	public static void main(String[] args) {
		RectangleProcedural rectangleProcedural = new RectangleProcedural();
		rectangleProcedural.width = 5;
		rectangleProcedural.height = 8;

		int area = rectangleProcedural.calculateArea();
		System.out.println("넓이 : " + area);

		int perimeter = rectangleProcedural.calculatePerimeter();
		System.out.println("둘레 : " + perimeter);

		boolean isSquare = rectangleProcedural.isSquare();
		System.out.println("정사각형 여부 : " + isSquare);
	}
}
