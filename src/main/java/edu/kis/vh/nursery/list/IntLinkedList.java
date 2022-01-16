package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int INT = -1;
	private Node last;
	int i;

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return INT;
		return getLast().value;
	}

	public int pop() {
		if (isEmpty())
			return INT;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
