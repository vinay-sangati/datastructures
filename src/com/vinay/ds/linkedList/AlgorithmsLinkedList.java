package com.vinay.ds.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsLinkedList {

	// do remember , size is unknown
	public static<T> void findNthFromLast(int n,SinglyLinkedList<T> ll) {
		// there are few unhandled conditions// conditions are based on assumption of values exists already
	Node<T> resultVal = ll.head; // this is not right , the implementation class must provide the methods to 
	//access the next values
	
	Node<T> depthcounter= null;
	int counter = 1;
	while(counter++ < n) {
		depthcounter = resultVal.nextNode;
		resultVal = resultVal.nextNode;
	}
	Node<T> startVal = ll.head;
	while(depthcounter.nextNode != null) {
	
		startVal = startVal.nextNode;
		depthcounter= depthcounter.nextNode;
		
	}
	System.out.println("found value "+ startVal.value);
	}
	
	public static<T> int sumofSplitNumber(LinkedList<T> ll1,LinkedList<T> ll2) {
		// generics are powerfull
		Iterator<T> i1 = ll1.iterator();
		Iterator<T> i2 = ll2.iterator();
		
		return 1;
	}
	
	
	
	public static<T> int sumofSplitNumber(SinglyLinkedList<T> ll1,SinglyLinkedList<T> ll2) {
		
		SinglyLinkedList<T> ll1counter = ll1;
		SinglyLinkedList<T> ll2counter = ll2;
		SinglyLinkedList<T> resultLL = new SinglyLinkedList<T>();
		// got to know why iterater interface is important,
		// because while writing a program you cant interact with your code with node
		// i feel it voilates some basic oops concept
		// do you interact with nodes while you access any linkedlist
		/*
		 * while() {
		 * 
		 * }
		 */
		
		
		return 1;
	}
	
}
