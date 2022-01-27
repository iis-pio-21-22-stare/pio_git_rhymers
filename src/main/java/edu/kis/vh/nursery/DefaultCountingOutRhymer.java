package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int RETURN = -1;
    public static final int SIZE_OF_TABLE = 12;
    private int[] NUMBERS = new int[SIZE_OF_TABLE];

    public int total = EMPTY_RHYMER_INDICATOR;


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == SIZE_OF_TABLE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total--];
    }

}
