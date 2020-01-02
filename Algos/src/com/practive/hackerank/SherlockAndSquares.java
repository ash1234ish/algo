package com.practive.hackerank;

public class SherlockAndSquares {

	public static void main(String[] args) {
		System.out.println(squares(3,26));
	}
	
	
    static int squares(int a, int b) {
    	
    	int count = 0;
//    	while(a <= b) {
//    		
//    		if()
//    		
//    		
//    		System.out.println(a + "  " + "floor " + Math.floor(Math.sqrt(a)));
//    		System.out.println("ceil " + Math.ceil(Math.sqrt(a)));
//    		System.out.println(" ");
//    		a++;
//    	}
    	
    	while(a <= b) {
    		double sqrt = Math.sqrt(a);
            if((Math.floor(sqrt)- sqrt) == 0) {
                count ++;
            }
            a++;
        }
        return count;
    }

}
