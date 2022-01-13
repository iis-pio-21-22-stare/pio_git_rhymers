package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

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
