package practice.algo.linkedlist;

public class ReverseLinkedListRecursive {

	public static void main(String[] args) {
			LinkedList llist = new LinkedList(); 

			llist.insertNode(20); 
			llist.insertNode(4); 
			llist.insertNode(15); 
			llist.insertNode(85); 

			System.out.println("Given linked list:"); 
			printSinglyLinkedList(llist.head, " "); 

			System.out.println(); 
			System.out.println("Reversed Linked list:"); 
			Node llist1 = reverse2(llist.head); 
			printSinglyLinkedList(llist1, " "); 

		}

		public static Node reverse(Node head) { 
			if(head == null) { 
				return head; 
			} 

			// last node or only one node 
			if(head.next == null) { 
				return head; 
			} 

			Node newHeadNode = reverse(head.next); 

			head.next.next = head; 
			head.next = null; 

			return newHeadNode; 
		} 

		
		public static Node reverse2(Node node) { 
						// last node or only one node 
			if(node.next == null) { 
				return node; 
			} 

			Node current = node;
			Node newHeadNode = reverse(node.next); 

			node.next.next = node; 
			node.next = null; 

			return newHeadNode; 
		}
		
		public static void printSinglyLinkedList(Node node, 
				String sep) { 
			while (node != null) { 
				System.out.print(String.valueOf(node.data) + sep); 
				node = node.next; 
			} 
		} 

	}
