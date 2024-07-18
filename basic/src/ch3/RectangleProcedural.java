package ch3;

public class RectangleProcedural {
	int width;
	int height;

	int calculateArea() {
		return width * height;
	}

	int calculatePerimeter() {
		return 2 * (width + height);
	}

	boolean isSquare() {
		return this.width == this.height;
	}
}
