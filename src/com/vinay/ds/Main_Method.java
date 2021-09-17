package com.vinay.ds;

import com.vinay.ds.linkedList.AlgorithmsLinkedList;
import com.vinay.ds.linkedList.DoublyLinkedList;
import com.vinay.ds.linkedList.SinglyLinkedList;
import com.vinay.ds.tree.BTNodeLL;
import com.vinay.ds.tree.BinaryTreeLL;

public class Main_Method {
public static void main(String[] args) {
	/*
	 * Recursions
	 * int[] a = {1,2,3,4,5}; System.out.println(RecursionProblems.arrayProd(a,4));
	 * System.out.println(RecursionProblems.factorial(10));
	 * System.out.println(RecursionProblems.fibonacci(10));
	 * System.out.println(RecursionProblems.adddigits(12345));
	 * System.out.println(RecursionProblems.power(4,3));
	 * System.out.println(RecursionProblems.binaryOut(1000));
	 * System.out.println(RecursionProblems.reverse("LET"));
	 * System.out.println(RecursionProblems.isPallendrome("TJET"));
	 */
	// Arrays
	/*
	 * int[] arrnumber = {1,2,3,33,4,5,6,8,99,10};
	 * System.out.println(ArrayProblems.getMissingNumber(arrnumber)); int[][]
	 * squarearray = {{1,2,3},{4,5,6},{7,8,9}};
	 * System.out.println(Arrays.deepToString(ArrayProblems.rotategivento90(
	 * squarearray))); System.out.println(ArrayProblems.diagnalSum(squarearray));
	 * System.out.println(Arrays.toString(ArrayProblems.topscore(arrnumber)));
	 */
	
	
	/*
	 * SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
	 * ll.insert(111111); ll.insert(32222); ll.insert(5444); ll.insert(443);
	 * ll.insert(4); // O(n) //ll.printValues();
	 * 
	 * 
	 * AlgorithmsLinkedList.findNthFromLast(4,ll);
	 */
	
	/*
	 * DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
	 * dll.insertHead("vinay"); dll.insertHead("pallavi"); dll.insertHead("kids");
	 * dll.insertHead("parents"); //dll.printAllForward(); //System.out.println();
	 * dll.printareverse();
	 */

	BinaryTreeLL<Integer> bt = new BinaryTreeLL<Integer>();
	BTNodeLL<Integer> rootnode = new BTNodeLL<Integer>();
	rootnode.value = 1;
	bt.root = rootnode;
	
	BTNodeLL<Integer> left1 = new BTNodeLL<Integer>();
	left1.value = 2;
	rootnode.left = left1;
	BTNodeLL<Integer> right1 = new BTNodeLL<Integer>();
	right1.value = 3;
	rootnode.right = right1;
	BTNodeLL<Integer> left2 = new BTNodeLL<Integer>();
	left2.value = 4;
	left1.left = left2;
	BTNodeLL<Integer> right2 = new BTNodeLL<Integer>();
	right2.value = 5;
	left1.right = right2;
	BTNodeLL<Integer> left3 = new BTNodeLL<Integer>();
	left3.value = 6;
	right1.left = left3;
	BTNodeLL<Integer> right3 = new BTNodeLL<Integer>();
	right3.value = 7;
	right1.right = right3;
	BTNodeLL<Integer> left4 = new BTNodeLL<Integer>();
	left4.value = 8;
	left2.left = left4;
	BTNodeLL<Integer> right4 = new BTNodeLL<Integer>();
	right4.value = 9;
	left2.right = right4;
	BTNodeLL<Integer> left5 = new BTNodeLL<Integer>();
	left5.value = 10;
	right2.left = left5;
	BTNodeLL<Integer> right5 = new BTNodeLL<Integer>();
	right5.value = 11;
	right2.right = right5;
	BTNodeLL<Integer> left6 = new BTNodeLL<Integer>();
	left6.value = 12;
	left3.left = left6;
	BTNodeLL<Integer> right6 = new BTNodeLL<Integer>();
	right6.value = 13;
	left3.right = right6;
	
	
	bt.preorderprint();
	
	
	
}
}






