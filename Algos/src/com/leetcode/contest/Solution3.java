package com.leetcode.contest;


public class Solution3 {
	
	public class  TreeNode{
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		}
	
	public static void main(String[] args) {
		
	}
	
	
	public TreeNode removeLeafNodes(TreeNode root, int target) {
        
		
			
		if (root == null)  
	        return null;  
	    root.left = removeLeafNodes(root.left, target);  
	    root.right = removeLeafNodes(root.right, target);  
	  
	    if (root.val == target && root.left == null && root.right == null) {  
	  
	        return null;  
	    }  
	    return root;
    }

}
