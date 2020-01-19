package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		List<String> list = printVertically("CONTEST IS COMING");
	}
	
	 public static List<String> printVertically(String s) {
	      
		 List<String> returnList  = new ArrayList<String>();
		 String [] arr = s.split("\\s");
		 
		 int maxlength = findMaxLength(arr);
		 
		 String regex = "\\s+$";
		 
		 for(int i = 0 ; i < maxlength;i++) {
			 	String str = "";
			 	for(int j =0 ; j < arr.length; j++) {
			 		if(i < arr[j].length()) {
			 			str = str.concat(""+arr[j].charAt(i));
			 		}
			 		else  {
			 			str = str.concat(""+" ");
			 		}
			 	}
			 	str = str.replaceAll(regex, "");
			 	returnList.add(str);
		 }
		 return returnList;
	 }
	 
	 private static int findMaxLength(String []arr) {
		 
		 int maxLength = 0;
		 
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 if(maxLength < arr[i].length()) {
				 maxLength = arr[i].length();
			 }
		 }
		 return maxLength;
		 
	 }
}
