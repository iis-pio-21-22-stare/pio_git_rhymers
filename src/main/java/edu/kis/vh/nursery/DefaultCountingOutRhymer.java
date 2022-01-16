package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_ARRAY_SIZE = 12;
    public static final int TOTAL_START_VALUE = -1;
    public static final int FULL_VALUE = 11;
    public static final int ERROR = -1;
    private int[] numbers = new int[NUMBERS_ARRAY_SIZE];

    public int total = TOTAL_START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_START_VALUE;
    }

    public boolean isFull() {
        return total == FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    // kombinacja klawiszy alt + -> nie robi u mnie nic

}
