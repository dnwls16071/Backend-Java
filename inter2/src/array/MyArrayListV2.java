package array;

import java.util.Arrays;

public class MyArrayListV2 {

	// 배열 기본 크기
	private static final int DEFAULT_CAPACITY = 5;

	// Object 배열 선언
	private Object[] elementData;
	// 리스트 크기
	private int size = 0;

	public MyArrayListV2() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV2(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return elementData[index];
	}

	public void add(Object e) {
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}

	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public Object set(int index, Object element) {
		Object oldValue = elementData[index];
		elementData[index] = element;
		return oldValue;
	}

	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "MyArrayList{" +
				"elementData=" + Arrays.toString(elementData) +
				", size=" + size +
				"}, capacity=" + elementData.length;
	}
}
