package practice.algo.linkedlist;

public class ReverseLinlListIteratively {

	public static Node reverse(Node head) {
		
		if(head == null || head.next == null)
				return head;
		
		
		Node current = head;
		Node prev = null , next = null ;
		
		while(current != null) {
			next = current.next ;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList(); 

		llist.insertNode(20); 
		llist.insertNode(4); 
		llist.insertNode(15); 
		llist.insertNode(85); 
		llist.insertNode(86); 
		llist.insertNode(87); 
		llist.insertNode(88); 
		
		LinkedList.printSinglyLinkedList(llist.head , " "); 
		
		Node llist1 = reverse(llist.head); 
		
		System.out.println();
		LinkedList.printSinglyLinkedList(llist1," "); 
		

	}
}
