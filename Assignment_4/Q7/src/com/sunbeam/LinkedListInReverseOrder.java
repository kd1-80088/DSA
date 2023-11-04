package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListInReverseOrder {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public LinkedListInReverseOrder() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = head;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void reverseOrder() {
		Node trav = head;
		int i = 0;
		int[] arr = new int[5];

		List<Integer> a = new ArrayList<>();

		while (trav != null) {
			a.add(trav.data);
			trav = trav.next;
		}
		for (int k = a.size()-1; k >= 0; k--) {
			System.out.println(a.get(k));
		}
//with simple array
//		while (trav != null) {
//			arr[i] = trav.data;
//			i++;
//			trav = trav.next;
//		}
//		for (int j = arr.length - 1; j >= 0; j--) {
//			System.out.println(arr[j]);
//		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void deleteAll() {
		head = null;
	}

}
