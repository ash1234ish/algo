package practice.algo.linkedlist;

public class LinkedList {
	public Node head; 
	  
    public LinkedList() { 
        this.head = null; 
    } 

    public void insertNode(int nodeData) { 
        Node node = new Node(nodeData); 

        if (this.head != null) { 
            node.next = head; 
        }  
        this.head = node; 
    }
    
    public static void printSinglyLinkedList(Node node, String str) { 
		while (node != null) { 
			System.out.println(String.valueOf(node.data) +str); 
			node = node.next; 
		} 
	} 
}
