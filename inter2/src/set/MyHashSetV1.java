package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	LinkedList<Integer>[] buckets;
	private int capacity = DEFAULT_INITIAL_CAPACITY;
	private int size = 0;

	private void initBuckets() {
		buckets = new LinkedList[capacity];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	public MyHashSetV1() {
		initBuckets();
	}

	public MyHashSetV1(int capacity) {
		this.capacity = capacity;
		initBuckets();
	}

	public boolean add(int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex];
		if (bucket.contains(value)) {
			return false;
		}
		bucket.add(value);
		size++;
		return true;
	}

	private int hashIndex(int value) {
		return value % capacity;
	}

	public boolean contains(int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex];
		return bucket.contains(value);
	}

	public int getSize() {
		return size;
	}

	public boolean remove(int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex];
		boolean result = bucket.remove(Integer.valueOf(value));
		if (result) {
			size--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "MyHashSetV1{" +
				"buckets=" + Arrays.toString(buckets) +
				", capacity=" + capacity +
				", size=" + size +
				'}';
	}
}
