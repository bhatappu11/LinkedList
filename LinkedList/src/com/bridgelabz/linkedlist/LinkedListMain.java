package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(new Node(56));
		linkedList.append(new Node(70));
		linkedList.insert(new Node(30),56);
		
		linkedList.printNodes();
	}

}
