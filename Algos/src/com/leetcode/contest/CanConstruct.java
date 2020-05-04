package com.leetcode.contest;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i = 0; i < magazine.length(); i++){
            char c  = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        for(int i = 0 ; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.remove(c);
                if(count ==1)
                    map.remove(c);
                else{
                    map.put(c,count-1);
                }            
            }else{
                return false;
            }
            
        }
        return true;
        
    }

}
