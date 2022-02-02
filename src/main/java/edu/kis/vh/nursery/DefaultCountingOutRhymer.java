package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int INDEX_OF_EMPTY_ARRAY = -1;
	private static final int INDEX_OF_FULL_ARRAY = 11;

	private int[] tableOfNumbers = new int[ARRAY_SIZE];

	public int countOfNumbers = INDEX_OF_EMPTY_ARRAY;

	public void countIn(int in) {
		if (!isFull())
			tableOfNumbers[++countOfNumbers] = in;
	}

	public boolean callCheck() {
		return countOfNumbers == INDEX_OF_EMPTY_ARRAY;
	}

	public boolean isFull() {
		return countOfNumbers == INDEX_OF_FULL_ARRAY;
	}

	protected int peekaboo() {
		if (callCheck())
			return INDEX_OF_EMPTY_ARRAY;
		return tableOfNumbers[countOfNumbers];
	}

	public int countOut() {
		if (callCheck())
			return INDEX_OF_EMPTY_ARRAY;
		return tableOfNumbers[countOfNumbers--];
	}

}
