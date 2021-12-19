package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int LAST_INDEX = 11;
	public static final int NUM_OF_NUMBERS = 12;
	public static final int NO_ELEMENTS = -1;
	private int[] numbers = new int[NUM_OF_NUMBERS];

	public int total = NO_ELEMENTS;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == NO_ELEMENTS;
	}
		
	public boolean isFull() {
		return total == LAST_INDEX;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return NO_ELEMENTS;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return NO_ELEMENTS;
		return numbers[total--];
	}

}
