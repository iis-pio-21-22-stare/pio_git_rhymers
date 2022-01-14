package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int ERR_VALUE = -1;
	public static final int TOTAL_VALUE = -1;
	public static final int ELEVEN = 11;
	private int[] NUMBERS = new int[SIZE];

private int total = TOTAL_VALUE;

public void countin(int in) {
if (!isfull())
	NUMBERS[++total] = in;
}

public boolean callcheck() {
	return total == ERR_VALUE;
}

	public boolean isfull() {
		return total == ELEVEN;
	}

		protected int peekaboo() {
			if (callcheck())
				return ERR_VALUE;
			return NUMBERS[total];
		}

			public int countout() {
				if (callcheck())
					return ERR_VALUE;
				return NUMBERS[total--];
			}

	public int[] getNUMBERS() {
		return NUMBERS;
	}
}
