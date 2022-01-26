package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer defCountOutRhym = new defaultCountingOutRhymer();

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
