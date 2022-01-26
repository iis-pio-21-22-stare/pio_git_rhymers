package edu.kis.vh.nursery;

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
//zle sformatowe byly linijki: 5, 12, 13, 14 i 15
//kombinacja alt + strzalka przelacza nas miedzy ostatnio otwartymi edytorami