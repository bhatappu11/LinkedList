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
	public void insert(Node<K> node,K key) {
		Node<K> tempNode = head;
		while(tempNode!=null && !tempNode.getKey().equals(key)) {
			tempNode = tempNode.getNext();
		}
		if(tempNode == null)
			System.err.println("key not found");
		if(this.tail.equals(tempNode))
			this.tail = node;
		node.setNext(tempNode.getNext());
		tempNode.setNext(node);
	}
	
	public void printNodes() {
		Node<K> temp = head;
		while(temp!=null) {
			System.out.print(temp.getKey()+" ");
			temp = temp.getNext();
		}
	}
	
	
}
