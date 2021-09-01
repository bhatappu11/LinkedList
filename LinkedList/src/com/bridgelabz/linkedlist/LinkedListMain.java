package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		SortedLinkedList<Integer> linkedList = new SortedLinkedList<>();
		linkedList.add(new Node<Integer>(56));
		linkedList.add(new Node<Integer>(30));
		linkedList.add(new Node<Integer>(40));
		linkedList.add(new Node<Integer>(70));
		
		System.out.println(linkedList.size());
		
		linkedList.printNodes();
	}

}
