package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private int[] tableOfNumbers = new int[12];

	public int countOfNumbers = -1;

	public void countIn(int in) {
		if (!isFull())
			tableOfNumbers[++countOfNumbers] = in;
	}

	public boolean callCheck() {
		return countOfNumbers == -1;
	}

	public boolean isFull() {
		return countOfNumbers == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return tableOfNumbers[countOfNumbers];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return tableOfNumbers[countOfNumbers--];
	}

}
