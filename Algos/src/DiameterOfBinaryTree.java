
public class DiameterOfBinaryTree {
	static class A 
	{ 
		int ans = Integer.MIN_VALUE; 
	} 

	static int height(TreeNode root, A a)  
	{  
		if (root == null)  
			return 0;  

		int left_height = height(root.left, a);  

		int right_height = height(root.right, a);  

		a.ans = Math.max(a.ans, 1 + left_height + 
				right_height);  

		return 1 + Math.max(left_height, right_height);  
	}  

	static int diameterOfBinaryTree(TreeNode root)  
	{  
		if (root == null)  
			return 0;  

		A a = new A(); 
		int height_of_tree = height(root, a);  
		return a.ans;  
	}  

}
