package com.practice.binarytree;

import java.util.Iterator;
import java.util.Stack;

public class LeafNodePath {

	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(8); 
		tree.root.right = new Node(2); 
		tree.root.left.left = new Node(3); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(2);
		printLeafPath(tree.root);
	}

	public static void printLeafPath(Node root) {

		if(root == null)
			return;

		stack.push(root.data);
		printLeafPath(root.left);
		if(root.left == null && root.right == null)
			printstack(stack);
		printLeafPath(root.right);
		stack.pop();
	}	


	public static void printstack(Stack stk) {
		Iterator itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();
	}

}
