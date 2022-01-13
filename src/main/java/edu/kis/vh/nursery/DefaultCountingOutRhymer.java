package edu.kis.vh.nursery;


class DefaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	/**
	 *
	 * @param in
	 */
	public void countin(int in) {
		if (!isfull())
			NUMBERS[++total] = in;
	}

		public boolean callcheck() {
			return total == -1;
		}

			public boolean isfull() {
				return total == 11;
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

}
