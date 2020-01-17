package com.practice.binarytree;

public class PrintNoOfLeafNode {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(12);
        tree.root.right.right = new Node(13); 
        System.out.println(leafCount(tree.root));
	}
	
	
	public static int leafCount(Node root) {

		if(root == null)
			return 0;
		
		if(root.left == null && root.right ==null)
			return 1;
		
		return leafCount(root.left) + leafCount(root.right);
		
	}

}
