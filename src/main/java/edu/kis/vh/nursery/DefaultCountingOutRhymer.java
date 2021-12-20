package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_LIST_RETURN_VAL = -1;
	private static final int EMPTY_LIST_VAL = -1;
	private static final int FULL_LIST_VAL = 11;
	private static final int RHYMER_SIZE = 12;
	private final int[] numbers = new int[RHYMER_SIZE];
	public int total = EMPTY_LIST_VAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_LIST_VAL;
	}

	public boolean isFull() {
		return total == FULL_LIST_VAL;
	}

	protected int peekBoo() {
		if (callCheck())
			return EMPTY_LIST_RETURN_VAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_LIST_RETURN_VAL;
		return numbers[total--];
	}
}
