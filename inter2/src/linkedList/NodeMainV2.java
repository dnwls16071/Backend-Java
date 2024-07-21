package linkedList;

public class NodeMainV2 {
	public static void main(String[] args) {
		Node node = new Node("A");
		node.next = new Node("B");
		node.next.next = new Node("C");
		System.out.println(node);

		// 모든 노드 탐색하기
		System.out.println("모든 노드 탐색하기");
		printAll(node);
		
		// 마지막 노드 조회하기
		Node lastNode = getLastNode(node);
		System.out.println("lastNode = " + lastNode);

		// 특정 노드 조회하기
		int index = 2;
		Node indexNode = getNode(node, index);
		System.out.println("indexNode = " + indexNode);

		// 데이터 추가하기
		add(node, "D");
		System.out.println(node);
		add(node, "E");
		System.out.println(node);
		add(node, "F");
		System.out.println(node);
	}

	private static void add(Node node, String param) {
		Node lastNode = getLastNode(node);
		lastNode.next = new Node(param);
	}


	private static Node getNode(Node node, int index) {
		Node x = node;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}


	private static Node getLastNode(Node node) {
		Node x = node;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	private static void printAll(Node node) {
		Node x = node;
		while (x != null) {
			System.out.println(x.item);
			x = x.next;
		}
	}
}
