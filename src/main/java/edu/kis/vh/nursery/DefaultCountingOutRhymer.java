package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE_OF_ARRAY = 12;
    private static final int CHECK = -1;
    private final int[] numbers = new int[SIZE_OF_ARRAY];

    private int total = CHECK;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int lastElement() {
        if (callCheck())
            return CHECK;
        return numbers[total];
    }

    public int getTotal() {
        return total;
    }

    public int countOut() {
        if (callCheck())
            return CHECK;
        return numbers[total--];
    }

}

//alt + strzałka służy do przełączania się między otwartymi kartami