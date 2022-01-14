package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int BADCALL = -1;
	Node lastNode;
	int newElement;


	public void push(int i) {
		if (lastNode == null)
			lastNode = new Node(i);
		else {
			lastNode.next = new Node(i);
			lastNode.next.prev = lastNode;
			lastNode = lastNode.next;
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return BADCALL;
		return lastNode.value;
	}

	public int pop() {
		if (isEmpty())
			return BADCALL;
		int ret = lastNode.value;
		lastNode = lastNode.prev;
		return ret;
	}

}
