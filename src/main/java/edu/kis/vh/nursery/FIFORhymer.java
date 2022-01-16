package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
    private DefaultCountingOutRhymer stackRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            stackRhymer.countIn(super.countOut());

        int ret = stackRhymer.countOut();

        while (!stackRhymer.callCheck())

            countIn(stackRhymer.countOut());

        return ret;
    }
}
