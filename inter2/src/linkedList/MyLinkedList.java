package linkedList;

public class MyLinkedList<T> {
	private Node<T> first;
	private int size = 0;

	// 사이즈 조회
	public int getSize() {
		return size;
	}

	// void add(Object o) : 데이터 추가
	public void add(T o) {
		Node<T> node = new Node(o);
		// [1]. 첫 번째 노드가 없는 상황이라면? → node를 first로 설정
		// [2]. 첫 번째 노드가 있는 상황이라면? → 마지막 노드 뒤에다가 노드를 연결
		if (first == null) {
			first = node;
		} else {
			Node<T> lastNode = getLastNode();
			lastNode.next = node;
		}
		size++;
	}

	// int indexOf(Object o) : 데이터의 인덱스 취하기
	public int indexOf(T o) {
		int index = 0;
		for (Node<T> x = first; x != null; x = x.next) {
			if (x.item.equals(o)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	// Object get(int index) : 특정 인덱스의 데이터 취하기
	public T get(int index) {
		Node<T> x = getNode(index);
		return x.item;
	}

	// Node getNode(int index) : 특정 인덱스의 노드 취하기
	public Node<T> getNode(int index) {
		Node<T> x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// Object set(int index, Object element) : 데이터 변경
	public T set(int index, T element) {
		Node<T> x = getNode(index);
		T oldValue = x.item;
		x.item = element;
		return oldValue;
	}

	// Node getLastNode() : 마지막 노드 조회하기
	private Node getLastNode() {
		Node<T> x = first;
		// NullPointerException 예외 발생 → x != null (X), x.next != null;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	// void add(int index, Object o) : 특정 인덱스에 데이터를 추가
	public void add(int index, T o) {
		Node<T> x = new Node(o);
		// [1]. 첫 번째 위치에 노드를 추가한다면? → 기존의 첫 번째 노드를 새로운 노드의 next로 지정
		// [2]. 그 외의 위치에 노드를 추가한다면?
		// [2]-1. 기존 노드가 가리키는 노드를 새로운 노드가 가리키게끔 해야 한다.
		// [2]-2. 그리고 기존 노드가 가리키는 노드를 새로운 노드를 가리켜야 한다.
		if (index == 0) {
			x.next = first;
			first = x;
		} else {
			Node<T> node = getNode(index - 1);
			x.next = node.next;
			node.next = x;
		}
		size++;
	}

	// Object remove(int index) : 특정 인덱스 데이터 제거하기
	// [1]. 첫 번째 위치 노드를 삭제한다면? → 삭제 대상이 가리키는 노드를 first가 가리키도록 해야한다.
	// [2]. 그 외 위치 노드를 삭제한다면? → 노드가 입력될 직전 위치 노드를 찾고 신규 노드와 직전 위치 노드가 가리키는 다음 노드를 연결한다.
	public T remove(int index) {
		Node<T> removedNode = getNode(index);
		T removedItem = removedNode.item;
		if (index == 0) {
			first = removedNode.next;
		} else  {
			Node<T> node = getNode(index - 1);
			node.next = removedNode.next;
		}
		removedNode.next = null;
		removedNode.item = null;
		size--;
		return removedItem;
	}
	
	@Override
	public String toString() {
		return "MyLinkedList{" +
				"first=" + first +
				", size=" + size +
				'}';
	}
}
