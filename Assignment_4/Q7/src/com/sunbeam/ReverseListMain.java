package com.sunbeam;

public class ReverseListMain {

	public static void main(String[] args) {
		LinkedListInReverseOrder l1 = new LinkedListInReverseOrder();

		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.display();
		l1.reverseOrder();

	}

}
