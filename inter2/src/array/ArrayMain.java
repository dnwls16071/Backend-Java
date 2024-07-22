package array;

import java.util.Arrays;

public class ArrayMain {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(Arrays.toString(arr));

		// 배열의 첫 번째 위치에 데이터를 추가하는 경우
		int newValue = 3;
		addFirst(arr, newValue);
		System.out.println(Arrays.toString(arr));

		// 배열의 중간 위치에 데이터를 추가하는 경우
		int midValue = 4;
		addMid(arr, midValue);
		System.out.println(Arrays.toString(arr));

		// 배열의 마지막 위치에 데이터를 추가하는 경우
		int lastValue = 5;
		addLast(arr, lastValue);
		System.out.println(Arrays.toString(arr));
	}

	// 오른쪽에서부터 움직여야 데이터가 누락되지 않는다.
	private static void addFirst(int[] arr, int value) {
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = value;
	}

	// 오른쪽에서부터 움직여야 데이터가 누락되지 않는다.
	private static void addMid(int[] arr, int value) {
		for (int i = arr.length-1; i > arr.length / 2; i--) {
			arr[i] = arr[i-1];
		}
		arr[arr.length / 2] = value;
	}

	// 오른쪽에서부터 움직여야 데이터가 누락되지 않는다.
	private static void addLast(int[] arr, int value) {
		arr[arr.length - 1] = value;
	}
}
