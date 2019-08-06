package practice.algo.datastructure;

public class UniqueCharsInString {

	public static void main(String[] args) {
		boolean str = UniqueCharsInString.method3("abcdea");
		System.out.println(str);
		
	}

	/**
	 * @param str
	 * @return
	 * Time complexity O(n*2)
	 */
	public static boolean method1(String str) {
		for(int i = 0 ; i < str.length() ; i++ ) {
			for(int j = i +1; j < str.length(); j++) {
				
				if( str.charAt(i) != str.charAt(j)) {
					continue;
				}else {
					return false;
				}
			}
		} 	
		return true;
	}

	/**
	 * 
	 * @param str
	 * @return
	 * Time Complexity O(n)
	 * Space Complexity constant
	 */
	public static boolean method2(String str) {
		boolean store []  = new boolean [128] ;	
		for(int i = 0 ; i < str.length() ; i ++) {
			int ascciiValue = str.charAt(i);
			if(store[ascciiValue] == true) {
				return false;
			}else {
				store[ascciiValue] = true;
				continue;
			}
		}
		return true;
	}
	public static boolean method3(String str) {
		
		char arr[] = str.toCharArray();
		MergeSort mrgSort = new MergeSort();
		mrgSort.sort(arr, 0, arr.length-1); 
		
		for(int  i =0 ; i< arr.length -1 ; i ++) {
			if(arr[i] != arr[i+1]) {
				continue;
			}else
				return false;
		}
		return true;
	}


}
