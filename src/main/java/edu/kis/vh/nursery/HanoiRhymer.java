package edu.kis.vh.nursery;

//https://cezarywalenciuk.pl/blog/programing/skorty-kalwiszowe-eclipse
//Alt + ← and Alt + → Wracasz do miejsc, które wcześniej odwiedzałeś.

public class HanoiRhymer extends defaultCountingOutRhymer {

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
