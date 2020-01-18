package com.practice.array;

public class SmallerMissingPositiveNumber {

	
	
	public static void main(String[] args) {
		
	int [] arr = new int[] {7,8,9,10,11}	;
	
	SmallerMissingPositiveNumber sm = new SmallerMissingPositiveNumber();
	
	System.out.println(sm.firstMissingPositive(arr));
	
		
	}
public int firstMissingPositive(int[] arr) {
        
		sort(arr, 0, arr.length-1); // Sorts in nLogn
		int firstPositive = -1;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > 0 && arr[i-1] > 0) {
				if(firstPositive == -1) {
					firstPositive = arr[i-1];
				}
				if(arr[i] - arr[i-1] == 1) {
					continue;
				}
				else {
					return arr[i-1]+1;
				}
			}
		}
		if(firstPositive > 1) {
			return 1;
		}else{
			return arr[arr.length-1]+1;
		}
    }
    
    	public static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	    public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	      
	            int m = (l+r)/2; 
	  
	         
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	        
	            merge(arr, l, m, r); 
	        } 
	    }
}
