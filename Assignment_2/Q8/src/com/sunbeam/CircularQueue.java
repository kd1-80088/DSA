package com.sunbeam;

public class CircularQueue {
	private int front;
	private int rear;
	private int arr[];
	private int size;

	public CircularQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}

	public void push(int data) {
		if (rear == size - 1) {
			rear = 0;
		} else {
			rear++;
		}

		arr[rear] = data;
		if (front == -1)
			front++;
	}

	public void pop() {

		arr[front] = -1;
		if (front == rear) {
			rear = -1;
			front = -1;
		} else

		{
			if (front == size - 1) {
				front = 0;
			} else
				front++;
		}

	}

	public int peek() {
		return arr[front];
	}

	public boolean isFull() {
		if ((rear == size - 1 && front == 0) || (rear + 1 == front))
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (rear == -1) {
			return true;
		}
		return false;
	}
}
