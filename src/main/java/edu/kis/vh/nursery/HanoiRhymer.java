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
//sformatowane wiersze 5, 12, 14, 15
// alt i odpowiednie strzałki w lewo i prawo zmieniaja aktualny plik o jeden w lewo/prawo od obecnie otwartego