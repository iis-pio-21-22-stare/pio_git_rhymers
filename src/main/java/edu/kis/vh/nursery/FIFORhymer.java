package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {
	// Klawisz alt + strzałki umożliwia szybkie przełączanie się pomiędzy plikami otwartymi w IDE

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
