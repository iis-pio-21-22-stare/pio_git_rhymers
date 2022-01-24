package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int LEN = 12;
	public static final int BEGIN = -1;
	public static final int END = 11;
	private int[] numbers = new int[LEN];

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private int total = -1;

public void countin(int in) {
if (!isfull())
	numbers[++total] = in;
}

public boolean callcheck() {
	return total == BEGIN;
}

	public boolean isfull() {
		return total == END;
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
