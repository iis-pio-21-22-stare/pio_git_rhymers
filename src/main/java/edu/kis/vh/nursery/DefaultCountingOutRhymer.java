package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int LEN = 12;
    private static final int BEGIN_VAL = -1;
    private static final int LAST_INDEX = 11;
    private final int[] numbers = new int[LEN];

    private int total = BEGIN_VAL;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == BEGIN_VAL;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int lastElement() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int getTotal() {
        return total;
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
