package list;

public class MyLinkedList<T> implements MyList<T> {
	private Node<T> first;
	private int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(T t) {
		Node<T> node = new Node(t);
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

	@Override
	public void add(int index, T t) {
		Node<T> x = new Node(t);
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

	@Override
	public T get(int index) {
		Node<T> x = getNode(index);
		return x.item;
	}

	@Override
	public T set(int index, T t) {
		Node<T> x = getNode(index);
		T oldValue = x.item;
		x.item = t;
		return oldValue;
	}

	@Override
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
	public int indexOf(T t) {
		int index = 0;
		for (Node<T> x = first; x != null; x = x.next) {
			if (x.item.equals(t)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "MyLinkedList{" +
				"first=" + first +
				", size=" + size +
				'}';
	}

	public Node<T> getNode(int index) {
		Node<T> x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	private Node getLastNode() {
		Node<T> x = first;
		// NullPointerException 예외 발생 → x != null (X), x.next != null;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}
}
