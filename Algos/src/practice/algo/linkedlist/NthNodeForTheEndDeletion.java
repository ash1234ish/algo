package practice.algo.linkedlist;

public class NthNodeForTheEndDeletion {
	
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
		
		
		System.out.println(llist.head.data);
		Node llist1 = delete(llist.head,3); 
		
		System.out.println();
		printSinglyLinkedList(llist.head," "); 
		

	}
	
	
	public static Node delete(Node head, int n) { 
		Node slow = head;
		Node fast = head;
		
		for( int i =0 ; i <= n-1 ; i++) {
			fast = fast.next;
		}
		
		while( fast.next != null) {
			fast=fast.next;
			slow= slow.next;
		}
		slow.next = slow.next.next;
		
		return head; 
	} 
	
	public static void printSinglyLinkedList(Node node, String str) { 
		while (node != null) { 
			System.out.println(String.valueOf(node.data) +str); 
			node = node.next; 
		} 
	} 

}
