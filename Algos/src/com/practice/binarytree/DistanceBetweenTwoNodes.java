package com.practice.binarytree;

public class DistanceBetweenTwoNodes {
	
	/**
	 * Finding the distance between two nodes in the binary tree.
	 * Below program uses the approach of finding the LCA first and 
	 * sums the distance beween the left node from the LCA with the 
	 * distnace of right sunbtree from the LCA
	 * which will give the distance between the two nodes
	 */
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7); 
        Node lca = findLCA(tree.root,7,3);
        
        int leftDistance = findLevel(lca,7,0);
        int rightDistance= findLevel(lca,3,0);
        
        System.out.println(  leftDistance+rightDistance) ;
	}
	
		
	private static Node findLCA(Node root, int n1, int n2) {
		
		if(root == null)
			return null;
		
		if(root.data == n1 || root.data == n2)
			return root;
		
		Node left = findLCA(root.left,n1 ,n2);
		Node right = findLCA(root.right,n1,n2);
		
		if(left != null && right != null)
			return root;
		
		return (left != null) ?left: right;
		
	}
	
	private static int findLevel(Node root, int n1, int level) {
		
		if(root == null)
			return -1;
		
		if(root.data == n1)
			return level;
		
		int distance = findLevel(root.left,n1,level+1);
		
		if(distance > -1)
			return distance;
		
		if(distance == -1) {
			distance=  findLevel(root.right,n1,level+1);
		}
		
		return distance;
		
	}

}
