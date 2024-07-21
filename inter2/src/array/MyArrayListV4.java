package array;

import java.util.Arrays;

public class MyArrayListV4<T> {

	// 배열 기본 크기
	private static final int DEFAULT_CAPACITY = 5;

	// Object 배열 선언
	private Object[] elementData;
	// 리스트 크기
	private int size = 0;

	public MyArrayListV4() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV4(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	public int size() {
		return size;
	}

	public T get(int index) {
		return (T) elementData[index];
	}

	public void add(T e) {
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}

	public void add(int index, T e) {
		shiftRightFrom(index);
		elementData[index] = e;
		size++;
	}

	private void shiftRightFrom(int index) {
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i-1];
		}
	}

	public T remove(int index) {
		T oldValue = get(index);
		ShiftLeftFrom(index);
		size--;
		elementData[size] = null;
		return oldValue;
	}

	private void ShiftLeftFrom(int index) {
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i+1];
		}
	}


	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public T set(int index, T element) {
		T oldValue = (T) elementData[index];
		elementData[index] = element;
		return oldValue;
	}

	public int indexOf(T o) {
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
