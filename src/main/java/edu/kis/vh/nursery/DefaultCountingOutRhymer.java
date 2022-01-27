package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int FAILED = -1;
    private final int[] numbers = new int[SIZE];


    private int total = FAILED;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FAILED;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return FAILED;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FAILED;
        return numbers[total--];
    }

}
