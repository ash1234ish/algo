package com.practice.String;

import java.util.HashSet;
import java.util.Set;

public class AllPossibleSubStrings {

	static final int NO_OF_CHARS = 256; 
	
	public static void main(String[] args) {
		System.out.println(longestUniqueSubsttr("dvdf"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s == null || s.isEmpty())
			return 0;
		else{
			int largestSofar = 1;
			for(int i = 0; i < s.length()-1 ; i++) {
				String c = s.substring(i,i+1);
				for(int j = 0 ; j < s.length() -i ; j++) {
					String temp = c+s.substring(i+1,s.length()-j);
					int uniqueLength = 0;
					if(uniqueStringlength(temp)) {
						uniqueLength = temp.length();
					}
					largestSofar = (largestSofar > uniqueLength) ? largestSofar : uniqueLength;
				}
				largestSofar = (largestSofar > c.length()) ? largestSofar : c.length();
			}
			return largestSofar;
		}    
	}

	public static boolean uniqueStringlength(String str) {
		Set<String> set = new HashSet<String>();
		for(int i = 0 ; i < str.length() ; i++) {
			String c = str.substring(i,i+1);
			if(set.contains(c)) {
				return false;
			}else {
				set.add(c);
			}
		}
		return true;
	}
	
	
	public static int lengthOfLongestSubstringOptimized(String s) {
		int maxLength = 0;
		int currentLength = 0 ;
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0 ; i < s.length()-1 ; i++) {
			Character temp = s.charAt(i);
			
			if(set.contains(temp)) {
				currentLength = 1;
			}else {
				set.add(temp);
				currentLength ++;
			}
			
			if(currentLength > maxLength)
				maxLength = currentLength;
			
		}
		
		return maxLength;
	}
	
	static int longestUniqueSubsttr(String str) 
    { 
        int n = str.length(); 
        int cur_len = 1; // length of current substring 
        int max_len = 1; // result 
        int prev_index; // previous index 
        int i; 
        int visited[] = new int[NO_OF_CHARS]; 
  
        /* Initialize the visited array as -1, -1 is  
         used to indicate that character has not been  
         visited yet. */
        for (i = 0; i < NO_OF_CHARS; i++) { 
            visited[i] = -1; 
        } 
  
        /* Mark first character as visited by storing the 
             index of first   character in visited array. */
        visited[str.charAt(0)] = 0; 
  
        /* Start from the second character. First character is 
           already processed (cur_len and max_len are initialized 
         as 1, and visited[str[0]] is set */
        for (i = 1; i < n; i++) { 
        	prev_index = visited[str.charAt(i)]; 
  
            /* If the current character is not present in 
           the already processed substring or it is not 
              part of the current NRCS, then do cur_len++ */
        	if (prev_index == -1 || i - cur_len > prev_index) 
                cur_len++; 
  
            /* If the current character is present in currently 
               considered NRCS, then update NRCS to start from 
               the next character of the previous instance. */
            else { 
                /* Also, when we are changing the NRCS, we 
                   should also check whether length of the 
                   previous NRCS was greater than max_len or 
                   not.*/
                if (cur_len > max_len) 
                    max_len = cur_len; 
  
                cur_len = i - prev_index; 
            } 
  
            // update the index of current character 
            visited[str.charAt(i)] = i; 
        } 
  
        // Compare the length of last NRCS with max_len and 
        // update max_len if needed 
        if (cur_len > max_len) 
            max_len = cur_len; 
  
        return max_len; 
    } 
}
