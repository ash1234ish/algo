package com.codility.dealerSocket;

import java.util.HashMap;
import java.util.Map;

class Solution {
	
 public int solution(String input) {
        Map<Character, Integer> map = new HashMap();
        initMap(map);
        StringBuilder sb = new StringBuilder();
        
        int ctr = 0;
        int count = 0;
        while(input.length() > 0 && ctr < input.length() ) {
            char curr = input.charAt(ctr);
            if(map.containsKey(curr)) {
                int occur = map.get(curr);
                if(occur == 1) {
                    map.remove(curr);
                } else {
                    map.put(curr, --occur);
                }
            } else {
                sb.append(curr);
              //  System.out.println(sb);
            }
            ctr++;
            if(map.size() == 0) {
                // done
                count++;
                initMap(map);
                input = sb.toString() + input.substring(ctr);
                //System.out.println(input);
                ctr = 0;
            }
        }
        return count;
    }        
    
    private static void initMap(Map<Character,Integer> map) {
        map.put('B', 1);
        map.put('A', 1);
        map.put('L', 2);
        map.put('O', 2);
        map.put('N', 1);
    }
}
