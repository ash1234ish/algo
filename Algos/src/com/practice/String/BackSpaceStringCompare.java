package com.practice.String;

import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		String S =  "a#c";
		String T = "b";
		BackSpaceStringCompare bc = new BackSpaceStringCompare();
		bc.backspaceCompare(S, T);
	}

	public boolean backspaceCompare(String S, String T) {
		

		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

		char [] arr1 = S.toCharArray();
		char [] arr2 = T.toCharArray();

		for(Character c: arr1) {
			if(c=='#') {
				if(!s1.isEmpty()) {
					s1.pop();
				}
			}
			else {
				s1.push(c);
			}
		}

		for(Character c: arr2) {
			if(c=='#') {
				if(!s2.isEmpty()) {
					s2.pop();
				}
			}
			else {
				s2.push(c);
			}
		}

		return isSameStack(s1,s2);
	}

	static boolean isSameStack(Stack<Character> stack1,  
			Stack<Character> stack2) 
	{ 
		boolean flag = true; 

		if (stack1.size() != stack2.size()) 
		{ 
			flag = false; 
			return flag; 
		} 

		while (stack1.empty() == false) 
		{ 
			if (stack1.peek() == stack2.peek()) 
			{ 
				stack1.pop(); 
				stack2.pop(); 
			} 
			else
			{ 
				flag = false; 
				break; 
			} 
		} 
		return flag; 
	} 

}
