package set;

import java.util.HashSet;
import java.util.Set;

public class RectangleMain {
	public static void main(String[] args) {
		Set<Rectangle> rectangles = new HashSet<>();
		rectangles.add(new Rectangle(10, 10));
		rectangles.add(new Rectangle(20, 20));
		rectangles.add(new Rectangle(20, 20));

		for (Rectangle rectangle : rectangles) {
			System.out.println("rectangle = " + rectangle);
		}
	}
}
