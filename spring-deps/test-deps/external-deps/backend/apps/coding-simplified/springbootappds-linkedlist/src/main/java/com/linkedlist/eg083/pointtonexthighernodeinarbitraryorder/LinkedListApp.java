package com.linkedlist.eg083.pointtonexthighernodeinarbitraryorder;

class Node {
	Node next;
	Node random;
	int data;
}

class LinkedList {

	public Node arbitraryPointToNextGreaterElement(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node = head;
		while (node != null) {
			node.random = node.next;
			node = node.next;
		}

		sortLinkedList(head);

		return head;
	}

	public Node sortLinkedList(Node node) {
		if (node == null || node.random == null) {
			return node;
		}

		Node middle = getMiddleNode(node);
		Node second = middle.random;
		middle.random = null;

		return mergeTwoList(sortLinkedList(node), sortLinkedList(second));
	}

	public Node getMiddleNode(Node node) {
		if (node == null || node.random == null) {
			return node;
		}

		Node slow, fast;
		slow = fast = node;

		while (fast.random != null && fast.random.random != null) {
			slow = slow.random;
			fast = fast.random.random;
		}

		return slow;
	}

	public Node mergeTwoList(Node first, Node second) {
		if (first == null && second == null) {
			return null;
		}

		Node tmp = new Node();
		Node finalList = tmp;
		while (first != null && second != null) {
			if (first.data < second.data) {
				tmp.random = first;
				first = first.random;
			} else {
				tmp.random = second;
				second = second.random;
			}

			tmp = tmp.random;
		}

		tmp.random = (first != null) ? first : second;

		return finalList.random;
	}

	public Node createNewNode(int i) {
		Node a = new Node();
		a.data = i;
		a.next = null;
		a.random = null;
		return a;
	}

	/*
	 * It'll print the complete linked list
	 */
	public void printList(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		printList(node.next);
	}

}

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();

		Node head = a.createNewNode(22);
		head.next = a.createNewNode(5);
		head.next.next = a.createNewNode(3);
		head.next.next.next = a.createNewNode(15);
		head.next.next.next.next = a.createNewNode(37);

		System.out.println("Original :");
		a.printList(head);

		head = a.arbitraryPointToNextGreaterElement(head);

		System.out.println("\nResult :");
		a.printList(head);
	}

}