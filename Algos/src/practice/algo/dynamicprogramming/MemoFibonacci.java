package practice.algo.dynamicprogramming;

public class MemoFibonacci {
	final int MAX = 100; 
	 final int NIL = -1; 
	  
	  int lookup[] = new int[MAX]; 
	  void _initialize() 
	  { 
	    for (int i = 0; i < MAX; i++) 
	        lookup[i] = NIL; 
	  } 
	  
	  int fib(int n) 
	  { 
	    if (lookup[n] == NIL) 
	    { 
	      if (n <= 1) 
	          lookup[n] = n; 
	      else
	          lookup[n] = fib(n-1) + fib(n-2); 
	    } 
	    return lookup[n]; 
	  } 
	  
	  public static void main(String[] args) 
	  { 
		  MemoFibonacci f = new MemoFibonacci(); 
	    int n = 9; 
	    f._initialize(); 
	    System.out.println("Fibonacci number is" + " " + f.fib(n)); 
	  } 

}
