package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() { // TODO: final should be added
		return total == -1;
	}
		
	public boolean isFull() { // TODO: final should be added
		return total == 11;
	}

	protected int peekaboo() { // TODO: final should be added
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
