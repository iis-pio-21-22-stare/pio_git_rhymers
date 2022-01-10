package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int INT12 = 12;
    public static final int TOTAL_VALUE = -1;
    public static final int ERROR_VALUE = -1;
    public static final int INT11 = 11;
    private final int[] numbers = new int[INT12];


    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == INT11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
