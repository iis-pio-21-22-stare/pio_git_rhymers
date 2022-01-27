package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TABLE_MAX_SIZE = 12;
	public static final int INDICATOR = -1;
	public static final int RETURN_VALUE = -1;
	private int[] numbers = new int[TABLE_MAX_SIZE];

	public int total = INDICATOR;

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INDICATOR;
	}

	public boolean isFull() {
		return total == TABLE_MAX_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[total--];
	}

}
