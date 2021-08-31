package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(70); 
		Node<Integer> secondNode = new Node<>(30); 
		Node<Integer> thirdNode = new Node<>(56); 
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		
		linkedList.printNodes();
	}

}
