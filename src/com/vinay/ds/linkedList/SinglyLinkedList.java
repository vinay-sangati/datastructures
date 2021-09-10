package com.vinay.ds.linkedList;

public class SinglyLinkedList<T> {
public Node<T> head;
public Node<T> tail;
public int size;

public boolean insertFirst(T val) {
	
	if(head == null) {
		Node<T> node = new Node<T>();
		node.value = val;
		head = node;
		tail = node;
		size++;
	}else {
		Node<T> node = new Node<T>();
		node.value = val;
		node.nextNode = head;
		head = node;
		size++;
	}
	
	return true;
}

public void printValues() {
	if(head != null) {
		Node<T> next = head;
	 do{
		System.out.println(next.value);
		if(next.nextNode != null) {
			next = next.nextNode;
		}
	}while(next.nextNode != null);
	}
}

}
