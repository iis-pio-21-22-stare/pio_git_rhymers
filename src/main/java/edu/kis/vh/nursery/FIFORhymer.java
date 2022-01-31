package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countout() {
	while (!callcheck())
		temp.countin(super.countout());
	int ret = temp.countout();
	while (!temp.callcheck())
		countin(temp.countout());
	return ret;
}

}
