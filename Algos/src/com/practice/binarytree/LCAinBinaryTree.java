package com.practice.binarytree;

public class LCAinBinaryTree {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7); 
        tree.root.right.right = new Node(11);
        tree.root.right.right.right = new Node(13);
        
        Node lca = findLCA(tree.root , 7,5);
        System.out.println(lca.data);
	}
	
	
	public static Node findLCA(Node root, int data1, int data2) {
		
		if(root == null)
			return null;
		
		if(root .data == data1 || root.data == data2)
			return root;
		
		Node leftLCA = findLCA(root.left,data1,data2);
		Node rightLCA = findLCA(root.right,data1,data2);
		
		if(rightLCA != null && leftLCA != null)
			return root;
		else
		 	return (leftLCA!= null ? leftLCA :rightLCA);		
	}

}
