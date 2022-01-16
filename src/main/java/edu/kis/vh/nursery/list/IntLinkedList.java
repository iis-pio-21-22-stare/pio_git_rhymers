package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;
	private final int empty = -1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return empty;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return empty;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}
}
