package LinkedList;

public class DesignLinkedList {

	public static class Node {
		int val;
		Node next;

		public Node(int x) {
			this.val = x;
		}
	}

	static class MyLinkedList {
		
		private Node head;
		/** Initialize your data structure here. */
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
		public void addAtHead(int val) {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		}

		/** Append a node of value val to the last element of the linked list. */
		public void addAtTail(int val) {

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
		public static void printLinkedList(Node head) {
			if (head == null) {
				System.out.println("List is empty");
			}
			else {
				Node temp = head;
				
				while (temp != null) {
					System.out.print(temp.val);
					temp = temp.next;
					
					if (temp != null) {
						System.out.print("->");
					}
					else {
						System.out.println();
					}
				}
			}
		}
	}

	/**
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
	 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */

}
