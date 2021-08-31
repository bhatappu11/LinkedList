package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(new Node<Integer>(56));
		linkedList.append(new Node<Integer>(70));
		linkedList.insert(new Node<Integer>(30),56);
		linkedList.search(30);
		
		linkedList.printNodes();
	}

}
