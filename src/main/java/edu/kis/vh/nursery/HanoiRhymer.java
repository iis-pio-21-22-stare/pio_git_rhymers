package edu.kis.vh.nursery;
// alt + -> służy łatwemu przemieszczaniu się pomiędzy plikami w projekcie


/**
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {


private int totalRejected = 0;

public int reportrejected() {
	return totalRejected;
}

@Override
public void countin(final int in) {
if (!callcheck() && in > peekaboo())
		totalRejected++;
		else
			super.countin(in);
}


}
