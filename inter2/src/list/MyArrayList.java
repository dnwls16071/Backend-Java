package list;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

	private static final int DEFAULT_CAPACITY = 5;

	// Object 배열 선언
	private Object[] elementData;
	// 리스트 크기
	private int size = 0;

	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(T t) {
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = t;
		size++;
	}

	@Override
	public void add(int index, T t) {
		if (size == elementData.length) {
			grow();
		}
		shiftRightFrom(index);
		elementData[index] = t;
		size++;
	}

	@Override
	public T get(int index) {
		return (T) elementData[index];
	}

	@Override
	public T set(int index, T t) {
		T oldValue = (T) elementData[index];
		elementData[index] = t;
		return oldValue;
	}

	@Override
	public T remove(int index) {
		T oldValue = get(index);
		shiftLeftFrom(index);
		size--;
		elementData[size] = null;
		return oldValue;
	}

	@Override
	public int indexOf(T t) {
		for (int i = 0; i < size; i++) {
			if (t.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	private void shiftRightFrom(int index) {
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
	}

	private void shiftLeftFrom(int index) {
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
	}
}
