package LinkedList;

public class DesignLinkedList {

	static class Node {
		int val;
		Node next;

		public Node(int x) {
			this.val = x;
		}
	}

	static class MyLinkedList {

		private Node head;

		public MyLinkedList() {
			head = null;
		}

		/**
		 * Get the value of the index-th node in the linked list. If the index is
		 * invalid, return -1.
		 */
		public int get(int index) {
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

		/**
		 * Add a node of value val before the first element of the linked list. After
		 * the insertion, the new node will be the first node of the linked list.
		 */
		public Node addAtHead(int val, Node head) {
			Node temp = new Node(val);
			
			if (head != null) {
				temp.next = head;
			} 
			return temp;
		}

		/** Append a node of value val to the last element of the linked list. */
		public void addAtTail(int val, Node head) {
//			Node lastNode = head;
//
//			while (lastNode != null) {
//				if (lastNode.next == null) {
//					Node newNode = new Node(val);
//					lastNode.next = newNode;
//				}
//				lastNode = lastNode.next;
//			}
			
			Node temp = new Node(val);
			
			if (head.next == null) {
				head.next = temp;
				temp.next = null;
			}
		}

		/**
		 * Add a node of value val before the index-th node in the linked list. If index
		 * equals to the length of linked list, the node will be appended to the end of
		 * linked list. If index is greater than the length, the node will not be
		 * inserted.
		 */
		public void addAtIndex(int index, int val) {

		}

		/** Delete the index-th node in the linked list, if the index is valid. */
		public void deleteAtIndex(int index) {

		}

		/** Print the Linked List */
		public void printLinkedList(Node head) {
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
	}

	public static void main(String[] args) {
//		MyLinkedList obj = new MyLinkedList();
//		int param_1 = obj.get(1);
//		obj.addAtHead(1);
//		obj.addAtTail(3);
//		obj.addAtIndex(1, 2);
//		obj.deleteAtIndex(1);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		n1.next = n2;
		n2.next = n3;
		
		MyLinkedList myList = new MyLinkedList();
		
		System.out.print("Linked List: ");
		myList.printLinkedList(n1);
		
		Node headNode = myList.addAtHead(0, n1);
		System.out.print("New Head: ");
		myList.printLinkedList(headNode);
		
		myList.addAtTail(4, n3);
		System.out.print("New Tail: ");
		myList.printLinkedList(headNode);
	}

}
