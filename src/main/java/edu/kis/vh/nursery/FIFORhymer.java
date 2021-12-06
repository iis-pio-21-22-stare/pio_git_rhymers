package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer stackRhymer = new defaultCountingOutRhymer();

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
