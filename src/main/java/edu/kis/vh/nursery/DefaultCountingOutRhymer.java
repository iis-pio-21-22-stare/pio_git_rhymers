package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int BADCALL = -1;
    private static final int FULL = 11;
    private static final int CHECK = -1;

    private final int[] numbers = new int[getSIZE()];

    private int total = -1;

    public static int getSIZE() {
        return SIZE;
    }

    public static int getBADCALL() {
        return BADCALL;
    }

    public static int getFULL() {
        return FULL;
    }

    public static int getCHECK() {
        return CHECK;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getCHECK();
    }

    public boolean isFull() {
        return total == getFULL();
    }

    protected int peekaboo() {
        if (callCheck())
            return getBADCALL();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getBADCALL();
        return numbers[total--];
    }

}
