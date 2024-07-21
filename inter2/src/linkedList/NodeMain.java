package linkedList;

public class NodeMain {
	public static void main(String[] args) {
		Node node = new Node("A");
		node.next = new Node("B");
		node.next.next = new Node("C");

		System.out.println("모든 노드 탐색하기");
		Node x = node;
		while (x != null) {
			System.out.println(x.item);
			x = x.next;
		}
	}
}
