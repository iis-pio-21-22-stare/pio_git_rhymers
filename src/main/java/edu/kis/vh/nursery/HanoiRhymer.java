package edu.kis.vh.nursery;
// alt + -> służy łatwemu przemieszczaniu się pomiędzy plikami w projekcie
public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

public int reportRejected() {
	return totalRejected;
}

public void countIn(int in) {
if (!callCheck() && in > peekaboo())
		totalRejected++;
		else
			super.countIn(in);
}
}
