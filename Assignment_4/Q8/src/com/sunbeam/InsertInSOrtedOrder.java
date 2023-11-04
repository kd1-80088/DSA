package com.sunbeam;

public class InsertInSOrtedOrder {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node head;

	public InsertInSOrtedOrder() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void add(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (value > trav.data) {
					break;
				}
				trav = trav.next;
			}

			nn.next = trav.next;
			trav.next = nn;
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
