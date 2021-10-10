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
		public Node addAtTail(int val, Node head) {
			Node lastNode = head;
			Node newNode = new Node(val);

			if (head != null) {
				while (lastNode.next != null) {
					lastNode = lastNode.next;
				}
				lastNode.next = newNode;
				return head;
			}

			return newNode;
		}

		/**
		 * Add a node of value val before the index-th node in the linked list. If index
		 * equals to the length of linked list, the node will be appended to the end of
		 * linked list. If index is greater than the length, the node will not be
		 * inserted.
		 */
		public Node addAtIndex(int index, int val, Node head) {
			Node curNode = head;
			Node newNode = new Node(val);
			int count = 0;

			if (index == 0) {
				return addAtHead(val, head);
			} else {
				while (curNode != null) {
					count++;

					if (count == index) {
						newNode.next = curNode.next;
						curNode.next = newNode;
						break;
					}
					curNode = curNode.next;
				}
				return head;
			}
		}

		/** Delete the index-th node in the linked list, if the index is valid. */
		public Node deleteAtIndex(int index, Node head) {
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
				return head;
			}
			return curNode.next;
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
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.next = n2;
		n2.next = n3;

		MyLinkedList myList = new MyLinkedList();

		System.out.print("Linked List: ");
		myList.printLinkedList(n1);

//		Add at head
		n1 = myList.addAtHead(0, n1);
		System.out.print("New Head: ");
		myList.printLinkedList(n1);

//		Add at tail
		n1 = myList.addAtTail(4, n1);
		System.out.print("New Tail: ");
		myList.printLinkedList(n1);

//		Add at index
		n1 = myList.addAtIndex(1, 5, n1);
		System.out.print("New Index: ");
		myList.printLinkedList(n1);
		
//		Delete at index
		n1 = myList.deleteAtIndex(3, n1);
		System.out.print("Delete Index: ");
		myList.printLinkedList(n1);
	}

}
