package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARR_SIZE = 12;
	public static final int EMPTY_LIST = -1;
	public static final int FULL_LIST = 11;

	private int[] numbers = new int[ARR_SIZE];

	public int total = EMPTY_LIST;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_LIST;
	}
		
	public boolean isFull() {
		return total == FULL_LIST;
	}
		
	protected int peekABoo() {
		if (callCheck())
			return EMPTY_LIST;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return EMPTY_LIST;
		return numbers[total--];
	}

}
