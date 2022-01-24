package edu.kis.vh.nursery;
// alt + -> służy łatwemu przemieszczaniu się pomiędzy plikami w projekcie


/**
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {


private int totalRejected = 0;

public int reportrejected() {
	return getTotalRejected();
}

@Override
public void countin(final int in) {
if (!callcheck() && in > peekaboo())
		setTotalRejected(getTotalRejected() + 1);
		else
			super.countin(in);
}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
