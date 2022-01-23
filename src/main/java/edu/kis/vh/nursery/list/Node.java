package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;

	public Node(final int data) {
		setValue(data);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

// alt + strzalka (lewo/prawo) pozwala na poruszanie sie po plikach projektu