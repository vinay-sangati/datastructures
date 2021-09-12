package com.vinay.ds.linkedList;

public class DoublyLinkedList<T> {

	public NodeDouble<T> head;
	public NodeDouble<T> tail;
	public int size;
	
	public boolean insertHead(T val) { 
		if(head == null) {
			NodeDouble<T> newnode = new NodeDouble<T>();
			newnode.val = val;
			newnode.next = null;
			newnode.previous = null;
			head = newnode;
			tail = newnode;
		}else { // assuming insertion happens at head
			NodeDouble<T> newnode = new NodeDouble<T>();
			newnode.val = val;
			newnode.next = head;
			head.previous = newnode;
			newnode.previous = null;
			head = newnode;
			size++;
			}
		return true;
	}
	
	public void printAllForward() {
	
		if(head != null) { // same goes for single linked list as well
			NodeDouble<T> cursor = head;
			do {
				System.out.println(cursor.val);
				cursor = cursor.next;
			}while(cursor != null);
			
		}
		
	}
	
	public void printareverse() {
		
		if(tail != null) { // we cant reverse iterate singly linked list
			NodeDouble<T> cursor = tail;
			do {
				System.out.println(cursor.val);
				cursor = cursor.previous;
			}while(cursor != null);
			
		}
		
	}
	public boolean insertTail(T val) { 
		
		return true;
	}
	public boolean insertIndex(T val) { 
	
	return true;
	}
}
