package com.bridgelabz.linkedlist;

public class LinkedList<K> {
	Node<K> head;
	Node<K> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(Node<K> node) {
		if(this.head == null) {
			this.head = node;
		}
		if(this.tail == null) {
			this.tail = node;
		}
		else {
			Node<K> tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}
	public void append(Node<K> node) {
		if(this.head == null) {
			this.head = node;
		}
		if(this.tail == null) {
			this.tail = node;
		}
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	
	public void printNodes() {
		Node<K> temp = head;
		while(temp!=null) {
			System.out.print(temp.getKey()+" ");
			temp = temp.getNext();
		}
	}
	
	
}
