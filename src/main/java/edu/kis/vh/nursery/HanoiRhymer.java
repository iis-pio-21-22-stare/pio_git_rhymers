package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

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
}

// wiersze 5 12 14 i 15 byly zle sformatowane
//alt <- -> odpowiednio zmieniaja aktualny plik na lewy/prawy od obecnie otwartego
