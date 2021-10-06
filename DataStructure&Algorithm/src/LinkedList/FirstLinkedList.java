package LinkedList;

public class FirstLinkedList {

	public static class Node {
		int val;
		Node next;

		public Node(int x) {
			this.val = x;
		}
	}

	public static int get(int index, Node head) {
		Node temp = head;
		int count = 0;

		while (temp != null) {
			if (count == index) {
				return temp.val;
			}
			count++;
			temp = temp.next;
		}
		return -1;
	}

	public static void addAtHead(int val, Node head) {
		Node temp = new Node(val);
		temp.next = head;
		head = temp;
	}

	public static void addAtTail(int val) {

	}

	public static void printLinkedList(Node head) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val);
				temp = temp.next;

				if (temp != null) {
					System.out.print(" -> ");
				} else {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.next = n2;
		n2.next = n3;

		System.out.println(get(0, n1));

		addAtHead(2, n1);

		printLinkedList(n1);
	}
}
