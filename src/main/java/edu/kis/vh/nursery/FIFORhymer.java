package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
	// Klawisz alt + strzałki umożliwia szybkie przełączanie się pomiędzy plikami otwartymi w IDE

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
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
