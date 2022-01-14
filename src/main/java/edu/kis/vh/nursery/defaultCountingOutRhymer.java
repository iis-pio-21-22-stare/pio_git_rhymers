package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    public static final int size_tab = 12;
    public static final int ErrCheck = -1;
    public static final int numb = 11;
    private  final int[] numbers = new int[size_tab];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == numb;
    }

    protected int peekaboo() {
        if (callCheck())
            return ErrCheck;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ErrCheck;
        return numbers[total--];
    }

}
