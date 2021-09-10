package com.vinay.ds.linkedList;

public class AlgorithmsLinkedList {

	// do remember , size is unknown
	public static<T> void findNthFromLast(int n,SinglyLinkedList<T> ll) {
		// there are few unhandled conditions// conditions are based on assumption of values exists already
	Node<T> resultVal = ll.head;
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
	
}
