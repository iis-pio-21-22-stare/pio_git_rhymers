package edu.kis.vh.nursery;
// alt + -> służy łatwemu przemieszczaniu się pomiędzy plikami w projekcie
public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int REJECTED_VALUE = 0;
	int totalRejected = REJECTED_VALUE;

	public int reportrejected() {
		return getTotalRejected();
	}

	@Override
	public void countin(int in) {
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
