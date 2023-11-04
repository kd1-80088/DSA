package com.sunbeam;

public class BubbleSortMain {

	public static void main(String[] args) {
		SortSinglyLinear s = new SortSinglyLinear();
		s.addFirst(10);
		s.addFirst(20);
		s.addFirst(30);
		s.addFirst(40);
		s.addFirst(50);
		s.addFirst(60);
		s.display();
		s.bubbleSort();
		System.out.println("After Bubble Sort");
		s.display();

	}

}
