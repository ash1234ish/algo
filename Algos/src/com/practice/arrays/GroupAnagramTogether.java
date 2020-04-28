package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagramTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static List<List<String>> groupAnagram(String[] strs){
		List<List<String>> list = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		String s;
		char[] c;
		String key;
		for (int i = 0; i < strs.length; i++) {
			s = strs[i];
			c = s.toCharArray();
			Arrays.sort(c);
			key = new String(c);
			if (map.containsKey(key)) {
				map.get(key).add(s);
			} else {
				List<String> glist = new ArrayList<String>();
				glist.add(s);
				map.put(key, glist);
			}
		}

		list.addAll(map.values());
		return list; 
	}

}
