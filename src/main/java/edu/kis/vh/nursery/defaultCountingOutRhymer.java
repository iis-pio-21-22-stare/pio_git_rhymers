package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    public static final int SIZE_TAB = 12;
    public static final int ERR_CHECK = -1;
    public static final int NUMB = 11;

    private  final int[] numbers = new int[SIZE_TAB];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == NUMB;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CHECK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CHECK;
        return numbers[total--];
    }

}
