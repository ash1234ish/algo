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
}
