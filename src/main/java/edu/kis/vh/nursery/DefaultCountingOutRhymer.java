package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TWELVE = 12;
    private static final int ERROR = -1;
    private static final int ELEVEN = 11;
    private  final int[] numbers = new int[TWELVE];

    private  int total = ERROR;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int lastElement() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
