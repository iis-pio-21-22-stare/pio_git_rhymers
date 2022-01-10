package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_ARRAY_LENGTH = 12;
    public static final int FULL = 11;
    public static final int CALL = -1;
    public static final int CALL_CHECKED = -1;
    public static final int TOTAL_INITIAL_VALUE = -1;

    private int[] numbers = new int[NUMBERS_ARRAY_LENGTH];
    public int total = TOTAL_INITIAL_VALUE;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return CALL_CHECKED;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CALL_CHECKED;
        return numbers[total--];
    }

}
