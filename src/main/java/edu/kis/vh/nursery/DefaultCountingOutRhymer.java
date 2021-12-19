package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int AMOUNT_OF_NUMBERS = 12;
    public static final int IS_FULL = 11;
    public static final int EMPTY_TABLE = -1;
    private final int[] numbers = new int[AMOUNT_OF_NUMBERS];

    public int total = EMPTY_TABLE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_TABLE;
    }

    public boolean isFull() {
        return total == IS_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_TABLE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_TABLE;
        return numbers[total--];
    }

}
