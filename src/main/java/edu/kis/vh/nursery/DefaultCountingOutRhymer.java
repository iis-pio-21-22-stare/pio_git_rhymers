package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int total = -1;
    public static int FULL = 11;
    public static int CALL = -1;
    public static int CALL_CHECKED = -1;

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
