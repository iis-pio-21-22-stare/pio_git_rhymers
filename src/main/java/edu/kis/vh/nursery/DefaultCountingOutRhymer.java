package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public final static int NUMBERS_COUNT = 12;
	public final static int TOTAL_NUMBER = -1;

	private int[] numbers = new int[NUMBERS_COUNT];

	public int total = TOTAL_NUMBER;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_NUMBER;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_NUMBER;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL_NUMBER;
		return numbers[total--];
	}
}
