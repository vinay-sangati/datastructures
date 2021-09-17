package com.vinay.ds.tree;

public class BTNodeLL<T> {

	public BTNodeLL<T> left;
	public BTNodeLL<T> right;
	public T value;
	
	public void preorderprint() {
		
		System.out.println("" + value );
		if(left != null) left.preorderprint();
		if(right != null )right.preorderprint();
		
	}
}
