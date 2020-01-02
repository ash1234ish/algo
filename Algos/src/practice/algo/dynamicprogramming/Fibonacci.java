package practice.algo.dynamicprogramming;

public class Fibonacci {
	

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci(); 
		int n = 9; 
		System.out.println("Fibonacci number is" + " " + recursiveFibo(n));  
		System.out.println("Fibonacci number is" + " " + recursiveFibo(n));  
	}

	public static int fib(int n) 
	{ 
		int f[] = new int[n+1]; 
		f[0] = 0; 
		f[1] = 1; 
		for (int i = 2; i <= n; i++) 
			f[i] = f[i-1] + f[i-2]; 
		return f[n]; 
	}
	
	
	public static int recursiveFibo(int n) {
		if(n <=2)
			return 1;
		return recursiveFibo(n-1) + recursiveFibo(n-2);
	}
}
