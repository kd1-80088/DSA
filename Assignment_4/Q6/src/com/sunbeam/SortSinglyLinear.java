package com.sunbeam;

public class SortSinglyLinear {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node head;

	public SortSinglyLinear() {

		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public void bubbleSort() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		if (head.next == null) {
			return;
		}
		Node trav1 = head;
		int temp;
		for (; trav1.next != null; trav1 = trav1.next) {
			Node trav2 = head;
			for (; trav2.next != null; trav2 = trav2.next) {
				if (trav2.data > trav2.next.data) {
					temp = trav2.data;
					trav2.data = trav2.next.data;
					trav2.next.data = temp;
				}
			}
		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
