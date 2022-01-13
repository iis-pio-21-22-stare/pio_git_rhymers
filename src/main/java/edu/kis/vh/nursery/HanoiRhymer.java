package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    static final int ZERO=0;
    int totalRejected = ZERO;

    public int reportrejected() {
        return totalRejected;
    }

    public void countin(int in) {
        if (!callcheck() && in > peekaboo())
            totalRejected++;
        else
            super.countin(in);
    }
}
