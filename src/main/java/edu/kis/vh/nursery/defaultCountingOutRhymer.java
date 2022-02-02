package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARAY_SIZE = 12;
    public static final int LAST_INDEX_OF_ARAY = 11;
    public static final int FIRST_INDEX_OF_EMPTY_ARAY = -1;

    private final int[] numbers = new int[ARAY_SIZE];

    public int total = FIRST_INDEX_OF_EMPTY_ARAY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FIRST_INDEX_OF_EMPTY_ARAY;
    }

    public boolean isFull() {
        return total == LAST_INDEX_OF_ARAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return FIRST_INDEX_OF_EMPTY_ARAY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FIRST_INDEX_OF_EMPTY_ARAY;
        return numbers[total--];
    }

}