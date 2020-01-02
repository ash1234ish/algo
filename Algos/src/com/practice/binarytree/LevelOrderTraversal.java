package com.practice.binarytree;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7); 
        levelOrder(tree.root);
        
	}
	
	public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>(); 
		
		q.offer(root);
		
		while(!q.isEmpty()) {
			Node element = q.poll();
			if(element == null) {
				System.out.println();
			}else {
				System.out.print( "" + element.data);
				q.offer(element.left);
				q.offer(element.right);
			}
		}
	}
}
