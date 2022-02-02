package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer defCountOutRhym = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			defCountOutRhym.countIn(super.countOut());

		int ret = defCountOutRhym.countOut();

		while (!defCountOutRhym.callCheck())
			countIn(defCountOutRhym.countOut());

		return ret;
	}
}
