package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int LEN = 12;
    private static final int BEGIN_VAL = -1;
    private static final int LAST_INDEX = 11;
    private final int[] numbers = new int[getLEN()];

    private int total = getBeginVal();

    public static int getLEN() {
        return LEN;
    }

    public static int getBeginVal() {
        return BEGIN_VAL;
    }

    public static int getLastIndex() {
        return LAST_INDEX;
    }

    public void countIn(final int in) {
        if (!isFull())
            getNumbers()[setTotal(getTotal() + 1)] = in;
    }

    public boolean callCheck() {
        return getTotal() == getBeginVal();
    }

    public boolean isFull() {
        return getTotal() == getLastIndex();
    }

    protected int lastElement() {
        if (callCheck())
            return -1;
        return getNumbers()[getTotal()];
    }

    public int getTotal() {
        return total;
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[setTotal(getTotal() - 1)];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
