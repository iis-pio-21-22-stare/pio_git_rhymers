package edu.kis.vh.nursery;

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

//W HanoiRhymer były źle sformatowane 4 wiersze: 5,12,14 i 15
//alt + -> i alt + <- w IDE IntelliJ IDEA zmienia obecnie otwartą kartę na następną lub poprzednią
