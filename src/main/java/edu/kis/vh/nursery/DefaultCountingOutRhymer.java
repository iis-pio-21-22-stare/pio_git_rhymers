package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TWELVE = 12;
	public static final int MJEDEN = -1;
	public static final int ELEVEN = 11;
	private int[] NUMBERS = new int[TWELVE];

private int total = -1;

public void countin(int in) {
if (!isfull())
	NUMBERS[++total] = in;
}

public boolean callcheck() {
	return total == MJEDEN;
}

	public boolean isfull() {
		return total == ELEVEN;
	}

		protected int peekaboo() {
			if (callcheck())
				return -1;
			return NUMBERS[total];
		}

			public int countout() {
				if (callcheck())
					return -1;
				return NUMBERS[total--];
			}

	public int[] getNUMBERS() {
		return NUMBERS;
	}
}
