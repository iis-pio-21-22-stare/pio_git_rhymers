package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int OK = 12;
	private static final int FAIL = -1;
	private final int[] numbers = new int[OK];

	public int getTotal() {
		return total;
	}

	private int total = FAIL;

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == FAIL;
	}

	protected boolean isFull() {
		return total == OK -1;
	}

	protected int peekaboo() {
		if (callCheck())
			return FAIL;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return FAIL;
		return numbers[total--];
	}

}
