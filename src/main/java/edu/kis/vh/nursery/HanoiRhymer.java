package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

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

// Które wiersze w klasie HanoiRhymer były źle sformatowane? 5,14,15
// Kombinacja klawiszy alt + ← oraz alt + → pozwala nam na przeskakiwanie pomiędzy otwartymi kartami w prawo i lewo.