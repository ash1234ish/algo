package practice.algo.linkedlist;

public class SwapInPairs {
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList(); 

		llist.insertNode(20); 
		llist.insertNode(4); 
		llist.insertNode(15); 
		llist.insertNode(85); 
		llist.insertNode(86); 
		llist.insertNode(87); 
		llist.insertNode(88); 
		
		printSinglyLinkedList(llist.head , " "); 
		swapInPairs(llist.head);
		System.out.println("Hello yeah");
		printSinglyLinkedList(llist.head , " "); 
	}
	
	public static void swapInPairs(Node head) {
		
		Node temp = head;
		
		while(temp != null && temp.next != null) {
			int datBackup = temp.data;
			temp.data = temp.next.data;
			temp.next.data = datBackup;
			temp = temp.next.next;
		}
	}
	
	
	public static void printSinglyLinkedList(Node node, String str) { 
		while (node != null) { 
			System.out.println(String.valueOf(node.data) +str); 
			node = node.next; 
		} 
	}	
}
