package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	final int TOTAL_START_VALUE = -1;
	final int NUMBERS_ARRAY_SIZE = 12;
	final int RETURN_VALUE = -1;

	private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];

	public int total = TOTAL_START_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_START_VALUE;
	}

	public boolean isFull() {
		return total == NUMBERS_ARRAY_SIZE - 1;
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
