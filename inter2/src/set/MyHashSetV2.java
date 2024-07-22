package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2<T> implements MySet<T> {
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	// 모든 타입 저장할 수 있게끔
	LinkedList<T>[] buckets;
	private int capacity = DEFAULT_INITIAL_CAPACITY;
	private int size = 0;

	private void initBuckets() {
		buckets = new LinkedList[capacity];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	public MyHashSetV2() {
		initBuckets();
	}

	public MyHashSetV2(int capacity) {
		this.capacity = capacity;
		initBuckets();
	}

	public boolean add(T value) {
		int hashIndex = hashIndex(value);
		LinkedList<T> bucket = buckets[hashIndex];
		if (bucket.contains(value)) {
			return false;
		}
		bucket.add(value);
		size++;
		return true;
	}

	private int hashIndex(Object value) {
		// 해시 코드 값 음수 방지 차원에서 절댓값
		return Math.abs(value.hashCode()) % capacity;
	}

	public boolean contains(Object value) {
		int hashIndex = hashIndex(value);
		LinkedList<T> bucket = buckets[hashIndex];
		return bucket.contains(value);
	}

	public int getSize() {
		return size;
	}

	public boolean remove(Object value) {
		int hashIndex = hashIndex(value);
		LinkedList<T> bucket = buckets[hashIndex];
		boolean result = bucket.remove(value);
		if (result) {
			size--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "MyHashSetV2{" +
				"buckets=" + Arrays.toString(buckets) +
				", capacity=" + capacity +
				", size=" + size +
				'}';
	}
}
