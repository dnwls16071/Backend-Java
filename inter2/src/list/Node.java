package list;

// 하나의 노드에는 데이터를 담는 부분과 어느 노드를 가리키는지에 대한 포인터 정보가 들어있다.
public class Node<T> {
	public T item;
	public Node<T> next;

	public Node(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node x = this;
		sb.append("[");
		while (x != null) {
			sb.append(x.item);
			if (x.next != null) {
				sb.append("->");
			}
			x = x.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
