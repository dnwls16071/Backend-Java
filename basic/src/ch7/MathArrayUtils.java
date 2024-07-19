package ch7;

public class MathArrayUtils {

	static int sum(int[] array) {
		int total = 0;
		for (int i : array) {
			total += i;
		}
		return total;
	}

	static double average(int[] array) {
		int total = 0;
		for (int i : array) {
			total += i;
		}
		return (double) total / array.length;
	}

	static int min(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

	static int max(int[] array) {
		int max = array[0];
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}
}
