package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int TOTAL_VAL = -1;
    public static final int CALL_CHECK_RETURN_VAL = -1;

    public int total = TOTAL_VAL;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_VAL;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return CALL_CHECK_RETURN_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CALL_CHECK_RETURN_VAL;
        return numbers[total--];
    }

}
