package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int BADCALL = -1;
    public static final int FULL = 11;
    public static final int CHECK = -1;

    private final int[] numbers = new int[SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return BADCALL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return BADCALL;
        return numbers[total--];
    }

}
