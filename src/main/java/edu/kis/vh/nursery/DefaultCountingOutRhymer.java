package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int LEN = 12;
	private static final int BEGIN = -1;
	private static final int END = 11;
	private int[] numbers = new int[getLEN()];

	public static int getLEN() {
		return LEN;
	}

	public static int getBEGIN() {
		return BEGIN;
	}

	public static int getEND() {
		return END;
	}

	public int getTotal() {
		return total;
	}



	private int total = -1;

public void countin(int in) {
if (!isfull())
	numbers[++total] = in;
}

public boolean callcheck() {
	return total == getBEGIN();
}

	public boolean isfull() {
		return total == getEND();
	}

		protected int peekaboo() {
			if (callcheck())
				return -1;
			return numbers[total];
		}

			public int countout() {
				if (callcheck())
					return -1;
				return numbers[total--];
			}

	public int[] getNumbers() {
		return numbers;
	}
}
