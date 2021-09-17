package com.vinay.ds.tree;

public class BinaryTreeLL<T> {

	public BTNodeLL<T> root;
	
	public boolean insert(T val) {
	return false;	
	}
	
	public void preorderprint() {
		// this will only help us to print some values
		// but if you want to find some value lets say, then recursion is the way
		System.out.println("Pre Order print brute force");
		root.preorderprint();
		
		System.out.println(" recursive .. very helpful  for searching etc ");
		System.out.println(preorderTraverse(root));
	}
	
	
	public String preorderTraverse(BTNodeLL<T> node) {
		System.out.println(node.value);
		return " "+node.value+" "+ (node.left != null ? preorderTraverse(node.left) : "")+" "+ (node.right != null ? preorderTraverse(node.right) : "");
		// while using ternary operator () are must . just keep in mind
	}
}
