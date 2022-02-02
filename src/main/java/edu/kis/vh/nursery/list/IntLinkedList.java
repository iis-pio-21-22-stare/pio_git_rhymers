package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALUE_WHEN_EMPTY_ARRAY = -1;
	Node lastNode;
	int thisVarIsUnused;

	public void push(int i) {
		if (lastNode == null)
			lastNode = new Node(i);
		else {
			lastNode.nextNode = new Node(i);
			lastNode.nextNode.prevNode = lastNode;
			lastNode = lastNode.nextNode;
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int topValue() {
		if (isEmpty())
			return VALUE_WHEN_EMPTY_ARRAY;
		return lastNode.value;
	}

	public int pop() {
		if (isEmpty())
			return VALUE_WHEN_EMPTY_ARRAY;
		int ret = lastNode.value;
		lastNode = lastNode.prevNode;
		return ret;
	}

}
