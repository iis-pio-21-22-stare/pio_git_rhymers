package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int REJECTED_COUNT = 0;
    int totalRejected = REJECTED_COUNT;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// Pytanie 1:  5, 12, 14, 15
// Pytanie 2: za pomocą 'alt + ->' i 'alt + <-' można przemieszczać się po otwartych plikach