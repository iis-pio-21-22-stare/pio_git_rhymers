package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_ARRAY = -1;
	private static final int ARRAY_SIZE = 12;
	private final int[] numbers = new int[ARRAY_SIZE];
	private static final int FULL_ARRAY = ARRAY_SIZE-1;

	private int total = EMPTY_ARRAY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ARRAY;
	}

	public boolean isFull() {
		return total == FULL_ARRAY;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total];
	}

	public int getTotal() {
		return total;
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total--];
	}

}
