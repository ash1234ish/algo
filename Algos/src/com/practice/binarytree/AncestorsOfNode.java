package com.practice.binarytree;

public class AncestorsOfNode {
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7); 
        
        printAncestor(tree.root,7);
		
	}
	
	
	public static boolean printAncestor(Node root, int data) {
		
		if(root == null)
			return false;
		
		if(root.data == data)
			return true;
		
		if(printAncestor(root.left,data) || printAncestor(root.right, data)) {
			System.out.println(root.data);
			return true;
		}
		
		return false;
				
		
	}

}
