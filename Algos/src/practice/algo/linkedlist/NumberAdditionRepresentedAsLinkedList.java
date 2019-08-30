package practice.algo.linkedlist;

public class NumberAdditionRepresentedAsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static Node addition(Node n1 , Node n2) {
		
		
		int sum = 0;
		int carryFrward = 0;
		while( n1!= null & n2 != null) {
			sum = carryFrward+ n1.data + n2.data;
			 if(sum > 10) {
				 carryFrward = sum/10;
			 }
			 
			 n1.data = sum % 10;
			 n1 = n1.next ;
			 n2= n2.next  ;
		}
		
		if(n1 != null||n2 != null) 
        { 
            if(n2 != null) 
            	n1.next = n2; 
            
            if(n1 != null)
            	while(n1 != null){
            		n1.data = (carryFrward + n1.data)%10 ;
            		carryFrward = 
            		
            }
            	
            
        } 
		if(carryFrward > 0) prev.next = new Node(carryFrward); 
		
		return ReverseLinkedListRecursive.reverse(null);
		
	}
}
