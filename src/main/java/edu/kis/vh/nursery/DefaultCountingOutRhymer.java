package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int OK = 12;
	public static final int FAIL = -1;
	private final int[] numbers = new int[OK];

	public int total = FAIL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == FAIL;
	}

	public boolean isFull() {
		return total == OK -1;
	}

	protected int peekaboo() {
		if (callCheck())
			return FAIL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return FAIL;
		return numbers[total--];
	}

}
