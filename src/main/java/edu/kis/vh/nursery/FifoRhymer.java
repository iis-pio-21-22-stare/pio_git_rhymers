package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int valueToReturn = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return valueToReturn;
    }
}
