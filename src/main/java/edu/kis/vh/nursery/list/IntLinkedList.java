package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int BADCALL = -1;
	private Node lastNode;
	private int newElement;


	public void push(int i) {
		if (getLastNode() == null)
			setLastNode(new Node(i));
		else {
			getLastNode().setNext(new Node(i));
			getLastNode().getNext().setPrev(getLastNode());
			setLastNode(getLastNode().getNext());
		}
	}

	public boolean isEmpty() {
		return getLastNode() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return BADCALL;
		return getLastNode().getValue();
	}

	public int pop() {
		if (isEmpty())
			return BADCALL;
		int ret = getLastNode().getValue();
		setLastNode(getLastNode().getPrev());
		return ret;
	}

	public Node getLastNode() {
		return lastNode;
	}

	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

	public int getNewElement() {
		return newElement;
	}

	public void setNewElement(int newElement) {
		this.newElement = newElement;
	}
}
