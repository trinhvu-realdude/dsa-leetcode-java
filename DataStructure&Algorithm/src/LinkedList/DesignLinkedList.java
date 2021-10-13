package LinkedList;

public class DesignLinkedList {

	public static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static class MyLinkedList {
		private Node head;

		public MyLinkedList() {
			head = null;
		}

		public int get(int index) {
			Node curNode = head;
			int count = 0;

			while (curNode != null) {
				if (count == index) {
					return curNode.val;
				}
				count++;
				curNode = curNode.next;
			}
			return -1;
		}

		public void addAtHead(int val) {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		}

		public void addAtTail(int val) {
			Node lastNode = head;
			Node newNode = new Node(val);

			if (head != null) {
				while (lastNode != null) {
					if (lastNode.next == null) {
						lastNode.next = newNode;
						newNode.next = null;
						return;
					}
					lastNode = lastNode.next;
				}
			}
			addAtHead(val);
		}

		public void addAtIndex(int index, int val) {
			Node newNode = new Node(val);
			Node curNode = head;
			int count = 0;

			if (index == 0) {
				addAtHead(val);
			} else {
				while (curNode != null) {
					count++;
					if (count == index) {
						newNode.next = curNode.next;
						curNode.next = newNode;
						return;
					}
					curNode = curNode.next;
				}

				if (count == index) {
					addAtTail(val);
				}
			}
		}

		public void deleteAtIndex(int index) {
			Node curNode = head;
			Node prevNode = null;
			int count = 0;

			if (index != 0) {
				while (curNode != null) {
					if (count == index) {
						prevNode.next = curNode.next;
					}
					count++;
					prevNode = curNode;
					curNode = curNode.next;
				}
			} else {
				head = head.next;
			}
		}

		public void printLinkedList() {
			if (head == null) {
				System.out.println("List is empty.");
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
	}

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.printLinkedList();
		
		myLinkedList.addAtTail(3);
		myLinkedList.printLinkedList();
		
		myLinkedList.addAtIndex(1, 2);
		myLinkedList.printLinkedList();
		
		System.out.println(myLinkedList.get(1)); // return 2
		
		myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
		myLinkedList.printLinkedList();
		
		System.out.println(myLinkedList.get(1)); // return 3
	}

}
