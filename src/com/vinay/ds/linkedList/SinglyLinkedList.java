package com.vinay.ds.linkedList;

public class SinglyLinkedList<T> {
public Node<T> head;
public Node<T> tail;
public int size;

//public boolean deleteNode(int n)
// pop
//peek
// queue methods

public boolean insert(T val) {
	
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

public boolean insertAtTail(T val) {//wrong
	// no need to travers at last // it can directly be added as we have tail node reference\// 
	// below code can be used to update at particular index
	// the the method has to be changed to insertAtposition(T val,int position)
	/*
	 * if(head == null) { insert(val); }else { Node<T> next = head; while(true) {
	 * if(next.nextNode != null) { next = next.nextNode; }else { Node<T> tailnode =
	 * new Node<T>(); tailnode.value = val; next.nextNode = tailnode; tail =
	 * tailnode; size++; break; }
	 * 
	 * }
	 * 
	 * }
	 */
	
return true;	
}

public void printValues() {
	if(head != null) {
		Node<T> next = head;
	 do{
		System.out.println(next.value);
		if(next.nextNode != null) {
			next = next.nextNode;
		}else {
			break;
		}
		
	}while(true);
	}
}

}
