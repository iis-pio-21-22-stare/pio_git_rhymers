package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int STARTING_VALUE = -1;
	private static final int LAST_ELEMENT = 11;

	private final int[] numbers = new int[SIZE];

	private int total = STARTING_VALUE;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STARTING_VALUE;
	}

	public boolean isFull() {
		return total == LAST_ELEMENT;
	}

	//TODO: change method name to be more specific
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
