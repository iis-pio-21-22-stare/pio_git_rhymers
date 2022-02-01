package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_SIZE = 12;
	public static final int EMPTY_ARRAY_INDEX = -1;
	public static final int FULL_ARRAY_INDEX = 11;
	private int[] numbers = new int[ARRAY_SIZE];

	public int total = EMPTY_ARRAY_INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ARRAY_INDEX;
	}
		
	public boolean isFull() {
		return total == FULL_ARRAY_INDEX;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return EMPTY_ARRAY_INDEX;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return EMPTY_ARRAY_INDEX;
	return numbers[total--];
	}

}
