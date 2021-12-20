package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARR_SIZE = 12;
	public static final int CHECK = -1;
	private int[] NUMBERS = new int[ARR_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == CHECK;
	}
		
	public boolean isFull() {
		return total == ARR_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
