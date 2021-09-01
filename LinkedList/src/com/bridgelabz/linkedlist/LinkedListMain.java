package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(new Node<Integer>(56));
		linkedList.append(new Node<Integer>(30));
		linkedList.append(new Node<Integer>(70));
		linkedList.insert(new Node<Integer>(40), 30);
		linkedList.delete(40);
		System.out.println(linkedList.size());
		
		linkedList.printNodes();
	}

}
