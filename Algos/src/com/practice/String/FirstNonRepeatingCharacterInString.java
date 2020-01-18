package com.practice.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		System.out.println(nonRepeat("aggwrlrawal"));
	}
	
	// below approach uses hashmap to O(n) space complexity && O(n) time complexity
	public static char nonRepeat(String str) {
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.remove(c);
				map.put(c,count+1);
			}else {
				map.put(c,1);
			}
		}
		
		Iterator<Character> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Character chr = itr.next();
			int count = map.get(chr);
			if(count ==1) {
				return chr;
			}
		}
		return  ' ';
	}
}
