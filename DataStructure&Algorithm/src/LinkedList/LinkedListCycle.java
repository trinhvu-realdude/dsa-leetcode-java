package LinkedList;

public class LinkedListCycle {
	public static class Node {
		int val;
		Node next;

		public Node(int x) {
			val = x;
			next = null;
		}
	}
	
	static class Solution {
	    public boolean hasCycle(Node head) {
	    	Node slow = head;
	    	Node fast = head;
	    	
	    	while (fast != null && fast.next != null) {
	    		fast = fast.next.next;
	    		slow = slow.next;
	    		
	    		if (slow == fast) {
					return true;
				}
	    	}
	    	return false;
	    }
	    
	    public void printLinkedList(Node head) {
	    	if (head == null) {
				System.out.println("List is empty");
			} else {
				while (head != null) {
					System.out.print(head.val);
					head = head.next;
					
					if (head != null) {
						System.out.print(" -> ");
					} else {
						System.out.println();
					}
				}
			}
	    }
	}


	public static void main(String[] args) {
		Solution myList = new Solution();
		
		Node n1 = new Node(3);
		Node n2 = new Node(2);
		Node n3 = new Node(0);
		Node n4 = new Node(-4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println(myList.hasCycle(n1));
	}
}
