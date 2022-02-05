package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private final int EMPTY_ARRAY_RETURN_CODE = -1;
	private final boolean FULL_ARRAY = false;
	private Node last;
	private int i;

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
		return FULL_ARRAY;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_ARRAY_RETURN_CODE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_ARRAY_RETURN_CODE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
