package com.practive.hackerank;

public class BeautifullDays {
	
	 static int beautifulDays(int i, int j, int k) {
	        int count = 0;
	            for (int m = i; m < j; m++) {
	                int reversedString = getReversed(m);
	                
	                System.out.println(reversedString +"-" + m + "%" + ((reversedString - m)));
	                
	                if ((reversedString - m) % k == 0) {
	                    count++;
	                }
	            }
	        return count;
	    }

	    private static int getReversed(int i) {
	        String str = i + "";
	        String newValue = "";
	        for (int k = str.length() - 1; k >= 0; k--) {
	            newValue = newValue + str.charAt(k);
	        }
	        return Integer.parseInt(newValue);
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(beautifulDays(13 ,45 ,3));
		}

}
