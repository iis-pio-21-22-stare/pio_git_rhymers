package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public final static int INITAL_REJECTED = 0;
	int totalRejected = INITAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	// alt + strzalko przelacza miedzy oknami w intellij
}
